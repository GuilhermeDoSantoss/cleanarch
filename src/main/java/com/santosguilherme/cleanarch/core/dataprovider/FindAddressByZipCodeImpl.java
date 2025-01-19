package com.santosguilherme.cleanarch.core.dataprovider;

import com.santosguilherme.cleanarch.core.domain.Address;
import com.santosguilherme.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.santosguilherme.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;


    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address fin(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
