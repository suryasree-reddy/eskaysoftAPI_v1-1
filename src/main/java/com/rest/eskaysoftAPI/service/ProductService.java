package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.Product;

public interface ProductService {

    Iterable<Product> listAllProduct();

    Product getProductById(Long id);

    Product saveProduct(Product schedule);

    Product deleteProduct(Long id);

    Product create(Product schedule);

}
