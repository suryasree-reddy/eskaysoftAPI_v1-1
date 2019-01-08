package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.GSTChallanEntryDto;

public interface GSTChallanService {

	List<GSTChallanEntryDto> listAllGSTChallan();

	GSTChallanEntryDto getGSTChallanById(Long id);

	GSTChallanEntryDto save(GSTChallanEntryDto gstChallan);

	boolean delete(Long id);

	GSTChallanEntryDto create(GSTChallanEntryDto gstChallan);

	boolean deleteDelvChallanByOrderNum(Integer id);

}
