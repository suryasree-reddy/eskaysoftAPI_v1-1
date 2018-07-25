

package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.ProductGroup;


public interface ProductGroupService {

    Iterable<ProductGroup> listAllProductGroups();

    ProductGroup getProductGroupById(Long id);

    ProductGroup saveProductGroup(ProductGroup productgroup);

    ProductGroup deleteProductGroup(Long id);

    ProductGroup create(ProductGroup productgroup);
}