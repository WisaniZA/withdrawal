package com.enviro.assessment.grad001.wisanimabasa.controller.rest;

import com.enviro.assessment.grad001.wisanimabasa.models.ProductDTO;
import com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

    private final ProductService productService;
@Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductDTO getProductId(UUID productId) {
        return productService.getProductId(productId);
    }
}
