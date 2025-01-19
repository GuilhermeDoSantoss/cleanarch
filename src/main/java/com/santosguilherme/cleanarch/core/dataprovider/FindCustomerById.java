package com.santosguilherme.cleanarch.core.dataprovider;

import com.santosguilherme.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
