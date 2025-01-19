package com.santosguilherme.cleanarch.dataprovider;

import com.santosguilherme.cleanarch.core.dataprovider.UpdateCustomer;
import com.santosguilherme.cleanarch.core.domain.Customer;
import com.santosguilherme.cleanarch.dataprovider.repository.CustomerRepsitory;
import com.santosguilherme.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerRepsitory customerRepsitory;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepsitory.save(customerEntity);
    }
}
