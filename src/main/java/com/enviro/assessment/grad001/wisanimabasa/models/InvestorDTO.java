package com.enviro.assessment.grad001.wisanimabasa.models;

import com.enviro.assessment.grad001.wisanimabasa.entity.Product;
import com.enviro.assessment.grad001.wisanimabasa.enums.Message;

import java.util.List;

public record InvestorDTO(String firstName, String lastName, int age, String email, String address, String contactNumber, List<Product> products, Message message) {
    public InvestorDTO(String firstName, String lastName, int age, String email, String address, String contactNumber, List<Product> products, Message message) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;
        this.products = products;
        this.message = message;

    }

    public String firstName() {return this.firstName;};

    public String lastName() {return this.lastName;
    }
    public int age() {return this.age;}
    public String email() {return this.email;}
    public String address() {return this.address;}
    public String contactNumber() {return this.contactNumber;}
    public List<Product> products() {return this.products;}
    public Message message(String validationMessage) {return this.message;}
}
