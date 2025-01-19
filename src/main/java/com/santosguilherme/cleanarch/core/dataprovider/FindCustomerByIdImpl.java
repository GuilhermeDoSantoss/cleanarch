package com.santosguilherme.cleanarch.core.dataprovider;

import com.santosguilherme.cleanarch.core.domain.Customer;
import com.santosguilherme.cleanarch.dataprovider.repository.CustomerRepsitory;
import com.santosguilherme.cleanarch.dataprovider.repository.entity.CustomerEntity;
import com.santosguilherme.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById{

    @Autowired
    private CustomerRepsitory customerRepsitory;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;


    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepsitory.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
