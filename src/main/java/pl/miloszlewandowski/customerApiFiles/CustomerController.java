package pl.miloszlewandowski.customerApiFiles;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
//@RequestMapping("/api")
public class CustomerController {

    private final CustomerRepository customerRepository;
    private final CustomerModelAssembler assembler;

    public CustomerController(CustomerRepository customerRepository, CustomerModelAssembler assembler) {
        this.customerRepository = customerRepository;
        this.assembler = assembler;
    }



//    @GetMapping("/vue")
//    public ModelAndView testVueJS(){
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("testVueJS");
//        return mav;
//    }





    @GetMapping("/customers")
    public CollectionModel getCustomersList(){

        List<EntityModel<Customer>> customers = customerRepository.findAll().stream()
                .map(assembler::toModel).collect(Collectors.toList());

        return new CollectionModel(customers, linkTo(methodOn(CustomerController.class)
                .getCustomersList()).withSelfRel());

    }

    @GetMapping("/customers/{id}")
    public EntityModel<Customer> getCustomerById(@PathVariable Long id){
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException(id));
        return assembler.toModel(customer);
    }

    @PostMapping("/customers")
    public ResponseEntity<?> newCustomer(@RequestBody Customer newCustomer) {

        EntityModel<Customer> entityModel = assembler.toModel(customerRepository.save(newCustomer));

        return ResponseEntity
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()).body(entityModel);
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity<?> replaceCustomer(@RequestBody Customer newCustomer, @PathVariable Long id){
        Customer updatedCustomer = customerRepository.findById(id).map(customer -> {
            customer.setFirstName(newCustomer.getFirstName());
            customer.setLastName(newCustomer.getLastName());
            return customerRepository.save(customer);
        }).orElseGet(() -> {
            newCustomer.setId(id);
            return customerRepository.save(newCustomer);
        });
        EntityModel<Customer> entityModel = assembler.toModel(updatedCustomer);

        return ResponseEntity.created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri()).body(entityModel);
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Long id){

        customerRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }


//    @GetMapping
//    public ModelAndView papor(){
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("pap");
//        return mav;
// }
}
