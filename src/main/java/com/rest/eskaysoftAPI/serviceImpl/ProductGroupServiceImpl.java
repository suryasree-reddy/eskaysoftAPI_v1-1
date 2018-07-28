package com.rest.eskaysoftAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.ProductGroupDao;
import com.rest.eskaysoftAPI.entity.ProductGroup;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.ProductGroupService;

@Service
public class ProductGroupServiceImpl implements ProductGroupService {

	private ProductGroupDao productgroupDao;

	@Autowired
	public void setproductgroupDao(ProductGroupDao productgroupDao) {
		this.productgroupDao = productgroupDao;
	}

	@Override
	public Iterable<ProductGroup> listAllProductGroups() {
		return productgroupDao.findAll();
	}

	@Override
	public ProductGroup getProductGroupById(Long id) {
		System.out.println("****************" + id);
		return productgroupDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("company %d not found", id)));
	}

	@Override
	public ProductGroup saveProductGroup(ProductGroup productgroup) {
		return productgroupDao.save(productgroup);
	}

	 @Override
		public boolean deleteProductGroup(Long id) {
			boolean status = false;
			ProductGroup productgroup = getProductGroupById(id);
			if (productgroup != null) {
				status = true;
				productgroupDao.delete(productgroup);
			}
			return status;
		}
	 
	@Override
	public ProductGroup create(ProductGroup productgroup) {

		return productgroupDao.save(productgroup);
	}

}
