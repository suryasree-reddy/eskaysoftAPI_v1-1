package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.Tax;
import com.rest.eskaysoftAPI.model.TaxDto;

public interface TaxService {

	List<TaxDto> listAllTaxs();

    Tax getTaxById(Long id);

    Tax saveTax(Tax tax);


    boolean deleteTax(Long id);


    Tax create(Tax tax);

}
