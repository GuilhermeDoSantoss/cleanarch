package com.santosguilherme.cleanarch.core.usecase;

import com.santosguilherme.cleanarch.core.domain.Customer;

public interface UpDateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
