package pl.filo.brewberyrestapi.web.mappers;

import org.mapstruct.Mapper;
import pl.filo.brewberyrestapi.domain.Customer;
import pl.filo.brewberyrestapi.web.model.CustomerDto;

/**
 * Created by T. Filo Zegarlicki on 09.05.2022
 **/
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
