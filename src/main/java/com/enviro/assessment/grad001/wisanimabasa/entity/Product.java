package com.enviro.assessment.grad001.wisanimabasa.entity;

import com.enviro.assessment.grad001.wisanimabasa.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private UUID productId;
    private String productName;
    private ProductType productType;
    private double currentBalance;
    private double withdrawalBalance;

}
