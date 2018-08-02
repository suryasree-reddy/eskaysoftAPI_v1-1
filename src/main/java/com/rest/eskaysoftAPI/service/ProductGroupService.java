

package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.ProductGroup;
import com.rest.eskaysoftAPI.model.ProductGroupDto;




public interface ProductGroupService {

    List<ProductGroupDto> listAllProductGroups();

    ProductGroup getProductGroupById(Long id);

    ProductGroup saveProductGroup(ProductGroup productgroup);

    boolean deleteProductGroup(Long id);
    
    ProductGroup create(ProductGroup productgroup);
}