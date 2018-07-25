package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.States;

public interface StatesService {

    Iterable<States> listAllStates();

    States getStateById(Long id);

    States saveState(States state);

    States deleteState(Long id);

    States create(States state);

}
