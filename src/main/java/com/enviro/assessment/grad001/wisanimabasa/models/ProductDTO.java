package com.enviro.assessment.grad001.wisanimabasa.models;

import com.enviro.assessment.grad001.wisanimabasa.enums.ProductType;

import java.util.UUID;

public record ProductDTO(UUID productId, String productName, ProductType productType, double currentBalance, double withdrawalBalance) {

    public ProductDTO(UUID productId, String productName, ProductType productType, double currentBalance, double withdrawalBalance) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.currentBalance = currentBalance;
        this.withdrawalBalance = withdrawalBalance;
    }
    public UUID productId() {
        return this.productId;
    }
    public String productName() {
        return this.productName;
    }
    public ProductType productType() {
        return this.productType;
    }
    public double currentBalance() {
        return this.currentBalance;
    }
    public double withdrawalBalance() {
        return this.withdrawalBalance;
    }
}
