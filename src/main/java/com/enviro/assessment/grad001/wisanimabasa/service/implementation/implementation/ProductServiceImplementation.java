package com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation;

import com.enviro.assessment.grad001.wisanimabasa.models.InvestorDTO;
import com.enviro.assessment.grad001.wisanimabasa.models.ProductDTO;
import com.enviro.assessment.grad001.wisanimabasa.repository.ProductRepository;
import com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation.interfaces.InvestorService;
import com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class ProductServiceImplementation implements ProductService {
    private final ProductRepository productRepository;
    private final InvestorService investorService;
@Autowired
    public ProductServiceImplementation(final ProductRepository productRepository, InvestorService investorService) {
        this.productRepository = productRepository;
    this.investorService = investorService;
}

    @Override
    public ProductDTO getProductById(UUID productId) {
        return productRepository.findById(String.valueOf(productId)).orElse(null);
    }

    @Override
    public String getProductValidation(ProductDTO productDTO, InvestorDTO investorDTO) {
        return investorService.validateWithdrawal(investorDTO, productDTO);
    }


}
