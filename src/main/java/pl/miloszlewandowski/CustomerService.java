package pl.miloszlewandowski;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public List<Customer> findAll() {

        List<Customer> customers = (List<Customer>) repository.findAll() ;
        return customers;

    }
}
