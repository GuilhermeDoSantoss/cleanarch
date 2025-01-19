package com.santosguilherme.cleanarch.dataprovider.repository;

import com.santosguilherme.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepsitory extends MongoRepository<CustomerEntity, String> {
}
