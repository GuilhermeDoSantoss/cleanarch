package com.santosguilherme.cleanarch.config;

import com.santosguilherme.cleanarch.core.dataprovider.FindAddressByZipCodeImpl;
import com.santosguilherme.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.santosguilherme.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.santosguilherme.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ){

    return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }
}
