package com.santosguilherme.cleanarch.config;

import com.santosguilherme.cleanarch.core.dataprovider.FindCustomerByIdImpl;
import com.santosguilherme.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ) {

        return new FindCustomerByIdUseCaseImpl(findCustomerById);

    }
}
