package com.rjtech.centrallib.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rjtech.centrallib.model.TaxRatesRulesCodeDtlEntity;

@Repository
public interface TaxRatesRulesCodeDtlRepository extends CentralLibRepository<TaxRatesRulesCodeDtlEntity, Long> {
	
	   

   
}