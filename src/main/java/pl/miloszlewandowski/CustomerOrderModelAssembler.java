package pl.miloszlewandowski;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class CustomerOrderModelAssembler implements RepresentationModelAssembler<CustomerOrder,
        EntityModel<CustomerOrder>> {

    public EntityModel<CustomerOrder> toModel(CustomerOrder order){
        EntityModel<CustomerOrder> orderModel = new EntityModel(order,
                linkTo(methodOn(CustomerOrderController.class).getCustomerOrderById(order.getId())).withSelfRel(),
                linkTo(methodOn(CustomerOrderController.class)
        .getAllCustomerOrders()).withRel("orders"));

        if (order.getStatus() == Status.IN_PROGRESS){
            orderModel.add(linkTo(methodOn(CustomerOrderController.class).cancel(order.getId())).withRel("cancel"));
            orderModel.add(linkTo(methodOn(CustomerOrderController.class).complete(order.getId())).withRel("complete"));
    }
        return orderModel;
    }
}
