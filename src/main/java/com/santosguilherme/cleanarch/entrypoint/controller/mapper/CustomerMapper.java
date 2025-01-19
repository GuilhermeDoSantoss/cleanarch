package com.santosguilherme.cleanarch.entrypoint.controller.mapper;


import com.santosguilherme.cleanarch.core.domain.Customer;
import com.santosguilherme.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.santosguilherme.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.springframework.web.bind.annotation.Mapping;

public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
