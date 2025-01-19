package com.santosguilherme.cleanarch.entrypoint.controller;

import com.santosguilherme.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.santosguilherme.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.santosguilherme.cleanarch.core.usecase.InsertCustomerUseCase;
import com.santosguilherme.cleanarch.core.usecase.UpDateCustomerUseCase;
import com.santosguilherme.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.santosguilherme.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.santosguilherme.cleanarch.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpDateCustomerUseCase upDateCustomerUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> upadate(@PathVariable final String id,
                                        @Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        upDateCustomerUseCase.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id){
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();

    }
}
