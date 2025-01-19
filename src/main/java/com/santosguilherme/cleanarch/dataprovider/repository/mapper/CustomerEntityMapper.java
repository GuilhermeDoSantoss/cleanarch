package com.santosguilherme.cleanarch.dataprovider.repository.mapper;


import com.santosguilherme.cleanarch.core.domain.Customer;
import com.santosguilherme.cleanarch.dataprovider.repository.entity.CustomerEntity;

public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
