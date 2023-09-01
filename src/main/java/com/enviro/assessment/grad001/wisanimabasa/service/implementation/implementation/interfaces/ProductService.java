package com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation.interfaces;

import com.enviro.assessment.grad001.wisanimabasa.models.InvestorDTO;
import com.enviro.assessment.grad001.wisanimabasa.models.ProductDTO;

import java.util.UUID;

public interface ProductService {
    ProductDTO getProductById(UUID productId);
    String getProductValidation(ProductDTO productDTO, InvestorDTO investorDTO);

}
