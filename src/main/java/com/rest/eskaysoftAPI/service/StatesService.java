package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.model.StatesDto;

public interface StatesService {

	List<StatesDto> listAllStates();

	States getStateById(Long id);

	States saveState(States state);

	boolean deleteState(Long id);

	States create(States state);

}
