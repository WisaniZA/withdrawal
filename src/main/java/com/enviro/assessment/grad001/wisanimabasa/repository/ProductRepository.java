package com.enviro.assessment.grad001.wisanimabasa.repository;

import com.enviro.assessment.grad001.wisanimabasa.entity.Product;
import com.enviro.assessment.grad001.wisanimabasa.models.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDTO, String> {
}
