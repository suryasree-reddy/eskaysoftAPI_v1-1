package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.CompanyGroup;
import com.rest.eskaysoftAPI.model.CompanyGroupDto;

public interface CompanyGroupService {

    List<CompanyGroupDto> listAllCompanygroup();

    CompanyGroup getCompanygroupById(Long id);

    CompanyGroup saveCompanygroup(CompanyGroup companygroup);

    boolean deleteCompanygroup(Long id);


    CompanyGroup create(CompanyGroup companygroup);

}
