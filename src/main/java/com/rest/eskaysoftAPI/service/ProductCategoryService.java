
package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.ProductCategory;
import com.rest.eskaysoftAPI.model.ProductCategoryDto;

public interface ProductCategoryService {

	List<ProductCategoryDto> listAllProductcategories();

	ProductCategory getProductCategoryById(Long id);

	ProductCategory saveProductCategory(ProductCategory productcategory);

	 boolean deleteProductCategory(Long id);
	ProductCategory create(ProductCategory productcategory);
}