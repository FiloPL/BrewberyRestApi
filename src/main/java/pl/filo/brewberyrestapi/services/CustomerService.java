package pl.filo.brewberyrestapi.services;

import pl.filo.brewberyrestapi.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by T. Filo Zegarlicki on 09.05.2022
 **/
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
