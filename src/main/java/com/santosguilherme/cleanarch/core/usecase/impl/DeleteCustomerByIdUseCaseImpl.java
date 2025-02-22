package com.santosguilherme.cleanarch.core.usecase.impl;

import com.santosguilherme.cleanarch.core.dataprovider.DeleteCustomerById;
import com.santosguilherme.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.santosguilherme.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerById deleteCustomerById) {

        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdUseCase.find(id);
        deleteCustomerById.delete(id);
    }
}
