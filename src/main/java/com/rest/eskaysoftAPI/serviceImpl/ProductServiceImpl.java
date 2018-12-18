package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.Company;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.entity.ProductCategory;
import com.rest.eskaysoftAPI.entity.Productgroup;
import com.rest.eskaysoftAPI.entity.Tax;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.ProductDto;
import com.rest.eskaysoftAPI.repository.CompanyRepository;
import com.rest.eskaysoftAPI.repository.ProductCategoryRepository;
import com.rest.eskaysoftAPI.repository.ProductGroupRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.repository.TaxRepository;
import com.rest.eskaysoftAPI.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository prorepo;

	@Autowired
	private TaxRepository taxrepo;

	@Autowired
	private CompanyRepository comrepo;

	@Autowired
	private ProductGroupRepository grprepo;

	@Autowired
	private ProductCategoryRepository catrepo;

	@Override
	public List<ProductDto> listAllProduct() {
		List<ProductDto> productList = new ArrayList<>();
		prorepo.findAllByOrderByNameAsc().forEach(product -> {
			ProductDto productModel = new ProductDto();
			BeanUtils.copyProperties(product, productModel);
			productModel.setCompanyId(product.getCompanyId().getId());
			productModel.setCompanyName(product.getCompanyId().getCompanyName());
			productModel.setProductgroupId(product.getProductgroupId().getId());
			productModel.setProductGroupName(product.getProductgroupId().getProductGroupName());
			productModel.setProductcategoryId(product.getProductcategoryId().getId());
			productModel.setProductCategoryName(product.getProductcategoryId().getProductCategoryName());
			productModel.setTaxId(product.getTaxId().getId());
			productModel.setTax(product.getTaxId().getTax());

			productList.add(productModel);
		});

		return productList;
	}

	@Override
	public ProductDto getProductById(Long id) {

		Product product = prorepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("product %d not found", id)));
		ProductDto prodModel = new ProductDto();
		BeanUtils.copyProperties(product, prodModel);
		prodModel.setTax(product.getTaxId().getTax());
		prodModel.setTaxId(product.getTaxId().getId());
		prodModel.setCompanyName(product.getCompanyId().getCompanyName());
		prodModel.setCompanyId(product.getCompanyId().getId());
		prodModel.setProductgroupId(product.getProductgroupId().getId());
		prodModel.setProductGroupName(product.getProductgroupId().getProductGroupName());
		prodModel.setProductCategoryName(product.getProductcategoryId().getProductCategoryName());
		prodModel.setProductcategoryId(product.getProductcategoryId().getId());
		

		return prodModel;
	}

	@Override
	public ProductDto updateProduct(ProductDto prodModel) {
		Tax tax = taxrepo.findById(prodModel.getTaxId())
				.orElseThrow(() -> new NotFoundException(String.format("tax %d not found", prodModel.getTaxId())));
		Product product = new Product();
		product.setTaxId(tax);

		Company com = comrepo.findById(prodModel.getCompanyId()).orElseThrow(
				() -> new NotFoundException(String.format("Company %d not found", prodModel.getCompanyId())));

		product.setCompanyId(com);

		Productgroup grp = grprepo.findById(prodModel.getProductgroupId()).orElseThrow(
				() -> new NotFoundException(String.format("Product %d not found", prodModel.getProductgroupId())));
		product.setProductgroupId(grp);

		ProductCategory category = catrepo.findById(prodModel.getProductcategoryId())
				.orElseThrow(() -> new NotFoundException(
						String.format("ProductCategory %d not found", prodModel.getProductcategoryId())));

		product.setProductcategoryId(category);

		BeanUtils.copyProperties(prodModel, product);
		product = prorepo.save(product);
		return prodModel;
	}

	@Override
	public boolean deleteProduct(Long id) {
		boolean status = false;
		Product product = prorepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("product %d not found", id)));

		if (product != null) {
			prorepo.delete(product);
			status = true;
		}
		return status;
	}

	@Override
	public ProductDto create(ProductDto productModel) {
		Product product = new Product();

		Tax tax = taxrepo.findById(productModel.getTaxId()).orElseThrow(
				() -> new NotFoundException(String.format("product %d not found", productModel.getTaxId())));

		product.setTaxId(tax);

		Company com = comrepo.findById(productModel.getCompanyId()).orElseThrow(
				() -> new NotFoundException(String.format("Company %d not found", productModel.getCompanyId())));

		product.setCompanyId(com);

		Productgroup grp = grprepo.findById(productModel.getProductgroupId()).orElseThrow(() -> new NotFoundException(
				String.format("Productgroup %d not found", productModel.getProductgroupId())));
		product.setProductgroupId(grp);

		ProductCategory category = catrepo.findById(productModel.getProductcategoryId())
				.orElseThrow(() -> new NotFoundException(
						String.format("ProductCategory %d not found", productModel.getProductcategoryId())));
		product.setProductcategoryId(category);
		BeanUtils.copyProperties(productModel, product);

		product = prorepo.save(product);
		productModel.setId(product.getId());
		return productModel;

	}

}