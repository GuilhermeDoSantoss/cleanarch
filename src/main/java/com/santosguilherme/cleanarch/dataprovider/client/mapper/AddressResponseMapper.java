package com.santosguilherme.cleanarch.dataprovider.client.mapper;


import com.santosguilherme.cleanarch.core.domain.Address;
import com.santosguilherme.cleanarch.dataprovider.client.response.AddressResponse;

public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
