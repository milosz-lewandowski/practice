package pl.miloszlewandowski;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class CustomerOrderController {
    private final CustomerOrderRepository customerOrderRepository;
    private final CustomerOrderModelAssembler customerOrderAssembler;

    public CustomerOrderController(CustomerOrderRepository customerOrderRepository,
                                   CustomerOrderModelAssembler customerOrderAssembler) {
        this.customerOrderRepository = customerOrderRepository;
        this.customerOrderAssembler = customerOrderAssembler;
    }

    @GetMapping("/orders")
    CollectionModel<EntityModel<CustomerOrder>> getAllCustomerOrders() {

        List<EntityModel<CustomerOrder>> customerOrders = customerOrderRepository.findAll().stream()
                .map(customerOrderAssembler::toModel).collect(Collectors.toList());

        return new CollectionModel(customerOrders,
                linkTo(methodOn(CustomerOrderController.class).getAllCustomerOrders()).withSelfRel());
    }


    @GetMapping("/orders/{id}")
    EntityModel<CustomerOrder> getCustomerOrderById(@PathVariable Long id){

        CustomerOrder customerOrder = customerOrderRepository.findById(id).orElseThrow(() ->
                new CustomerOrderNotFoundException(id));

        return customerOrderAssembler.toModel(customerOrder);
    }

    @PostMapping("/orders")
    ResponseEntity<EntityModel<CustomerOrder>> newCustomerOrder(@RequestBody CustomerOrder order){

        order.setStatus(Status.IN_PROGRESS);
        CustomerOrder newOrder = customerOrderRepository.save(order);

        return ResponseEntity.created(linkTo(methodOn(CustomerOrderController.class)
                .getCustomerOrderById(newOrder.getId())).toUri())
                .body(customerOrderAssembler.toModel(newOrder));
    }

    @DeleteMapping("/orders/{id}/cancel")
    ResponseEntity<?> cancel(@PathVariable Long id){
        CustomerOrder order = customerOrderRepository.findById(id)
                .orElseThrow(() -> new CustomerOrderNotFoundException(id));

        if (order.getStatus() == Status.IN_PROGRESS){
            order.setStatus(Status.CANCELLED);
            return ResponseEntity.ok(customerOrderAssembler.toModel(customerOrderRepository.save(order)));
        }

        return ResponseEntity.badRequest().body("Can't cancel order: " + order.getId());
    }

    @PutMapping("/orders/{id}/complete")
    ResponseEntity<?> complete(@PathVariable Long id){
        CustomerOrder order = customerOrderRepository.findById(id)
                .orElseThrow(() -> new CustomerOrderNotFoundException(id));

        if (order.getStatus() == Status.IN_PROGRESS){
            order.setStatus(Status.COMPLETED);
            return ResponseEntity.ok(customerOrderAssembler.toModel(customerOrderRepository.save(order)));
        }

        return ResponseEntity.badRequest().body("Can't complete order: " + order.getId());

    }
}
