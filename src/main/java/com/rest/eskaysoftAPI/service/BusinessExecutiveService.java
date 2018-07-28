package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.BusinessExecutive;

public interface BusinessExecutiveService {

    Iterable<BusinessExecutive> listAllBusinessExecutive();

    BusinessExecutive getBusinessExecutiveById(Long id);

    BusinessExecutive saveBusinessExecutive(BusinessExecutive businessexecutive);

    boolean deleteBusinessExecutive(Long id);
    BusinessExecutive create(BusinessExecutive businessexecutive);

}
