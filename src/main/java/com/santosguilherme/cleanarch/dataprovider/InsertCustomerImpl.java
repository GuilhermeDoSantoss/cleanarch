package com.santosguilherme.cleanarch.dataprovider;

import com.santosguilherme.cleanarch.core.dataprovider.InsertCustomer;
import com.santosguilherme.cleanarch.core.domain.Customer;
import com.santosguilherme.cleanarch.dataprovider.repository.CustomerRepsitory;
import com.santosguilherme.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepsitory customerRepsitory;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepsitory.save(customerEntity);

    }
}
