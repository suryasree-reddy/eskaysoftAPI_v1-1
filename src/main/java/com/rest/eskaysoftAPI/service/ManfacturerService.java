package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.Manfacturer;

public interface ManfacturerService {

    Iterable<Manfacturer> listAllManfacturer();

    Manfacturer getManfacturerById(Long id);

    Manfacturer save(Manfacturer manfacturer);

    Manfacturer delete(Long id);

    Manfacturer create(Manfacturer manfacturer);

}
