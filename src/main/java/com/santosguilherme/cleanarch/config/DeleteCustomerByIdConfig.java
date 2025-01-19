package com.santosguilherme.cleanarch.config;

import com.santosguilherme.cleanarch.core.dataprovider.DeleteCustomerByIdImpl;
import com.santosguilherme.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.santosguilherme.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);

    }
}
