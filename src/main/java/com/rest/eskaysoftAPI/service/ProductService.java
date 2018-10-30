package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.ProductDto;

public interface ProductService {

	List<ProductDto> listAllProduct();

	ProductDto getProductById(Long id);

	ProductDto updateProduct(ProductDto product);

	boolean deleteProduct(Long id);

	ProductDto create(ProductDto productModel);

}
