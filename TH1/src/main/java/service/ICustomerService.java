package service;

import model.Customer;
import model.Province;

import java.util.Optional;

public interface ICustomerService extends IGeneralService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
