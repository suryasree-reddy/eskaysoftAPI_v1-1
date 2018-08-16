package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.ProductGroup;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.ProductGroupDto;
import com.rest.eskaysoftAPI.repository.ProductGroupRepository;
import com.rest.eskaysoftAPI.service.ProductGroupService;

@Service
public class ProductGroupServiceImpl implements ProductGroupService {

	private ProductGroupRepository proGrpRepo;

	@Autowired
	public void setproductgroupDao(ProductGroupRepository proGrpRepo) {
		this.proGrpRepo = proGrpRepo;
	}

	@Override
	public List<ProductGroupDto> listAllProductGroups() {
		List<ProductGroupDto> productgroupList = new ArrayList<>();
		proGrpRepo.findAllByOrderByProductGroupNameAsc().forEach(productgroups -> {
			ProductGroupDto productgroupModel = new ProductGroupDto();
			BeanUtils.copyProperties(productgroups, productgroupModel);
			productgroupList.add(productgroupModel);
		});

		return productgroupList;
	}

	@Override
	public ProductGroup getProductGroupById(Long id) {
		System.out.println("****************" + id);
		return proGrpRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("company %d not found", id)));
	}

	@Override
	public ProductGroup saveProductGroup(ProductGroup productgroup) {
		return proGrpRepo.save(productgroup);
	}

	@Override
	public boolean deleteProductGroup(Long id) {
		boolean status = false;
		ProductGroup productgroup = getProductGroupById(id);
		if (productgroup != null) {
			status = true;
			proGrpRepo.delete(productgroup);
		}
		return status;
	}

	@Override
	public ProductGroup create(ProductGroup productgroup) {

		return proGrpRepo.save(productgroup);
	}

}
