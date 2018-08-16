package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.ProductCategory;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.ProductCategoryDto;
import com.rest.eskaysoftAPI.repository.ProductCategoryRepository;
import com.rest.eskaysoftAPI.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	private ProductCategoryRepository procatrepo;

	@Autowired
	public void setproductcategoryDao(ProductCategoryRepository procatrepo) {
		this.procatrepo = procatrepo;
	}

	@Override
	public List<ProductCategoryDto> listAllProductcategories() {
		List<ProductCategoryDto> productcategoryList = new ArrayList<>();
		procatrepo.findAllByOrderByProductCategoryNameAsc().forEach(productcategories -> {
			ProductCategoryDto productcategoryModel = new ProductCategoryDto();
			BeanUtils.copyProperties(productcategories, productcategoryModel);
			productcategoryList.add(productcategoryModel);
		});

		return productcategoryList;
	}

	@Override
	public ProductCategory getProductCategoryById(Long id) {
		System.out.println("****************" + id);
		return procatrepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("ProductCategory %d not found", id)));
	}

	@Override
	public ProductCategory saveProductCategory(ProductCategory productcategory) {
		return procatrepo.save(productcategory);
	}

	@Override
	public boolean deleteProductCategory(Long id) {
		boolean status = false;
		ProductCategory productcategory = getProductCategoryById(id);
		if (productcategory != null) {
			status = true;
			procatrepo.delete(productcategory);
		}
		return status;
	}

	@Override
	public ProductCategory create(ProductCategory productcategory) {

		return procatrepo.save(productcategory);
	}

}
