package com.santosguilherme.cleanarch.entrypoint.consumer.mapper;


import com.santosguilherme.cleanarch.core.domain.Customer;
import com.santosguilherme.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.web.bind.annotation.Mapping;

public interface CustomerMessageMapper {

    @Mapping(target = "address1",  ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
