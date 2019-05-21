package com.anjuc.utils.buyer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import java.util.List;
import com.anjuc.utils.buyer.Buyer;


public interface BuyerRepository  extends JpaRepository<Buyer, Integer> {


    public Buyer findBuyerByBuyerCode(String BuyerCode);
    public void deleteBuyerById(int id);
    public Buyer findBuyerById(int id);
    
	
	
}
