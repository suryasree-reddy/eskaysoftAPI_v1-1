package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.CompanyGroup;

public interface CompanyGroupService {

    Iterable<CompanyGroup> listAllCompanygroup();

    CompanyGroup getCompanygroupById(Long id);

    CompanyGroup saveCompanygroup(CompanyGroup companygroup);

    boolean deleteCompanygroup(Long id);


    CompanyGroup create(CompanyGroup companygroup);

}
