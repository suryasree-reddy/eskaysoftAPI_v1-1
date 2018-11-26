package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.InternalStockAdjustmentsDto;

public interface InternalStockAdjustmentsService {

	List<InternalStockAdjustmentsDto> listAllInternalStockAdjustments();

	InternalStockAdjustmentsDto getInternalStockAdjustmentsById(Long id);

	InternalStockAdjustmentsDto save(InternalStockAdjustmentsDto internalStockAdjustments);

	boolean delete(Long id);

	InternalStockAdjustmentsDto create(InternalStockAdjustmentsDto internalStockAdjustments);

}
