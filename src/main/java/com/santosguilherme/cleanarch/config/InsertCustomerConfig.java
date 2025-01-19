package com.santosguilherme.cleanarch.config;

import com.santosguilherme.cleanarch.core.dataprovider.FindAddressByZipCodeImpl;
import com.santosguilherme.cleanarch.core.dataprovider.SendCpfForValidationImpl;
import com.santosguilherme.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.santosguilherme.cleanarch.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation) {

        return new InsertCustomerUseCaseImpl(findAddressByZipCode,
                insertCustomer, sendCpfForValidation);
    }
}
