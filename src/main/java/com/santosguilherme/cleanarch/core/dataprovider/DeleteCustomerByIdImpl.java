package com.santosguilherme.cleanarch.core.dataprovider;

import com.santosguilherme.cleanarch.dataprovider.repository.CustomerRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById{

    @Autowired
    private CustomerRepsitory customerRepsitory;

    @Override
    public void delete(String id) {
        customerRepsitory.deleteById(id);

    }
}
