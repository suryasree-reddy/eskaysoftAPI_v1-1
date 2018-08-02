package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.Manfacturer;
import com.rest.eskaysoftAPI.model.ManfacturerDto;

public interface ManfacturerService {

    List<ManfacturerDto> listAllManfacturer();

    Manfacturer getManfacturerById(Long id);

    Manfacturer save(Manfacturer manfacturer);

    boolean delete(Long id);

    Manfacturer create(Manfacturer manfacturer);

}
