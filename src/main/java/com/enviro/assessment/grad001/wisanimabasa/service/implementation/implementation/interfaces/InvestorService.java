package com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation.interfaces;

import com.enviro.assessment.grad001.wisanimabasa.models.InvestorDTO;
import com.enviro.assessment.grad001.wisanimabasa.models.ProductDTO;


public interface InvestorService {
    InvestorDTO createWithdrawalNotice(InvestorDTO investorDTO, ProductDTO productDTO);
    String validateWithdrawal(InvestorDTO investorDTO, ProductDTO productDTO);


}
