package com.santosguilherme.cleanarch.core.usecase.impl;

import com.santosguilherme.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.santosguilherme.cleanarch.core.dataprovider.UpdateCustomer;
import com.santosguilherme.cleanarch.core.domain.Customer;
import com.santosguilherme.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.santosguilherme.cleanarch.core.usecase.UpDateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpDateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final FindAddressByZipCode findAddressByZipCode;

    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(
            FindAddressByZipCode findAddressByZipCode,
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            UpdateCustomer updateCustomer) {

        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);

    }


}
