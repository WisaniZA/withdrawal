package com.enviro.assessment.grad001.wisanimabasa.repository;

import com.enviro.assessment.grad001.wisanimabasa.entity.Investor;
import com.enviro.assessment.grad001.wisanimabasa.models.InvestorDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestRepository extends JpaRepository<InvestorDTO, String> {
}
