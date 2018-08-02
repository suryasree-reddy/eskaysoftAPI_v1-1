package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.model.ProductDto;

public interface ProductService {

    List<ProductDto> listAllProduct();

    Product getProductById(Long id);

    Product saveProduct(Product schedule);

    boolean deleteProduct(Long id);

    Product create(Product schedule);

}
