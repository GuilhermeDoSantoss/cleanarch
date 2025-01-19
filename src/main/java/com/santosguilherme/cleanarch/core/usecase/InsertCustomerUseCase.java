package com.santosguilherme.cleanarch.core.usecase;

import com.santosguilherme.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
