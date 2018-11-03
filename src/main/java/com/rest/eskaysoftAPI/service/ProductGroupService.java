package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.Productgroup;
import com.rest.eskaysoftAPI.model.ProductgroupDto;

public interface ProductGroupService {

	List<ProductgroupDto> listAllProductGroups();

	Productgroup getProductGroupById(Long id);

	Productgroup updateProductGroup(Productgroup productgroup);

	boolean deleteProductGroup(Long id);

	Productgroup create(Productgroup productgroup);
}