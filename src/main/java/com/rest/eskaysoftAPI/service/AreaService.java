package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.Area;

public interface AreaService {

    Iterable<Area> listAllArea();

    Area getAreaById(Long id);

    Area saveArea(Area area);

    boolean deleteArea(Long id);
    Area create(Area area);

}
