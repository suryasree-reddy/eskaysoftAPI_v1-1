
package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.ProductCategory;

public interface ProductCategoryService {

	Iterable<ProductCategory> listAllProductcategories();

	ProductCategory getProductCategoryById(Long id);

	ProductCategory saveProductCategory(ProductCategory productcategory);

	 boolean deleteProductCategory(Long id);
	ProductCategory create(ProductCategory productcategory);
}