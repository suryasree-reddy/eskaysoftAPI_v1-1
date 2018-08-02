package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.BusinessExecutive;
import com.rest.eskaysoftAPI.model.BusinessExecutiveDto;

public interface BusinessExecutiveService {

    List<BusinessExecutiveDto> listAllBusinessExecutive();

    BusinessExecutive getBusinessExecutiveById(Long id);

    BusinessExecutive saveBusinessExecutive(BusinessExecutive businessexecutive);

    boolean deleteBusinessExecutive(Long id);
    BusinessExecutive create(BusinessExecutive businessexecutive);

}
