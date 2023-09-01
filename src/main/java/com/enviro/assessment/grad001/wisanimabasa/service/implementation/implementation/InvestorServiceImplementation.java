package com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation;

import com.enviro.assessment.grad001.wisanimabasa.enums.ProductType;
import com.enviro.assessment.grad001.wisanimabasa.models.InvestorDTO;
import com.enviro.assessment.grad001.wisanimabasa.models.ProductDTO;
import com.enviro.assessment.grad001.wisanimabasa.repository.InvestRepository;
import com.enviro.assessment.grad001.wisanimabasa.service.implementation.implementation.interfaces.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestorServiceImplementation implements InvestorService {
    private final InvestRepository investRepository;

    @Autowired
    public InvestorServiceImplementation(final InvestRepository investRepository) {
        this.investRepository = investRepository;

    }

    @Override
    public InvestorDTO createWithdrawalNotice(InvestorDTO investorDTO, ProductDTO productDTO) {
        String validationMessage = validateWithdrawal(investorDTO,productDTO);

        if (!validationMessage.equals("Validation Successful. withdrawal can proceed")) {
            investorDTO.message(validationMessage);
            return investorDTO;
        }
        return investRepository.save(investorDTO);
    }

    @Override
    public String validateWithdrawal(InvestorDTO investorDTO,ProductDTO productDTO) {
        if (productDTO.withdrawalBalance() > productDTO.currentBalance()) {
            return "Insufficient Balance";
        }
        else if (investorDTO.age()>65){
            return "You cannot withdraw from a retirement account";
        }else if(productDTO.withdrawalBalance() > 0.9 * productDTO.currentBalance()){
            return "you cannot withdraw more than 90% of your balance";
        }
        return "Validation Successful. withdrawal can proceed";
    }




}
