package com.santosguilherme.cleanarch.core.usecase;

import com.santosguilherme.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
