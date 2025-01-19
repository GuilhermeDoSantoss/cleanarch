package com.santosguilherme.cleanarch.entrypoint.consumer;

import com.santosguilherme.cleanarch.core.usecase.UpDateCustomerUseCase;
import com.santosguilherme.cleanarch.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.santosguilherme.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpDateCustomerUseCase upDateCustomerUseCase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "guilherme-santos")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomer(customerMessage);
        upDateCustomerUseCase.update(customer, customerMessage.getZipCode());
    }
}
