package com.santosguilherme.cleanarch.core.domain;

import lombok.Getter;
import lombok.Setter;

public class Customer {

    public Customer(){
        this.isValidCpf = false;
    }

    public Customer(String id, String nome, String cpf, Address address, Boolean isValidCpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.address = address;
        this.isValidCpf = isValidCpf;
    }

    private String id;
    private String nome;
    private String cpf;
    private Address address;
    private Boolean isValidCpf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
