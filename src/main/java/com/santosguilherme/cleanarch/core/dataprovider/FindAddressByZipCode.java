package com.santosguilherme.cleanarch.core.dataprovider;

import com.santosguilherme.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address fin(final String zipCode);


}
