package com.enviro.assessment.grad001.wisanimabasa.controller.rest;

import com.enviro.assessment.grad001.wisanimabasa.models.InvestorDTO;
import com.enviro.assessment.grad001.wisanimabasa.models.ProductDTO;
import com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation.interfaces.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investors")
@CrossOrigin
public class InvestorController {

    private final InvestorService investorService;
@Autowired
    public InvestorController(final InvestorService investorService) {
        this.investorService = investorService;
    }

    @PostMapping("/invest")
    @ResponseStatus(HttpStatus.CREATED)
    public InvestorDTO createWithdrawalNotice(InvestorDTO investorDTO, ProductDTO productDTO) {
        return investorService.createWithdrawalNotice(investorDTO, productDTO);
    }
}
