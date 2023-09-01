package com.enviro.assessment.grad001.wisanimabasa.entity;

import com.enviro.assessment.grad001.wisanimabasa.enums.Message;
import com.enviro.assessment.grad001.wisanimabasa.models.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Investor {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String address;
    private String contactNumber;
    private List<ProductDTO> products;
    private Message message;

}
