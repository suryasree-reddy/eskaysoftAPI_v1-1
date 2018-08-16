package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.Manfacturer;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.ManfacturerDto;
import com.rest.eskaysoftAPI.repository.ManfacturerRepository;
import com.rest.eskaysoftAPI.service.ManfacturerService;

@Service
public class ManfacturerServiceImpl implements ManfacturerService {

	private ManfacturerRepository manrepo;

	@Autowired
	public void setAccountInformationDao(ManfacturerRepository manrepo) {
		this.manrepo = manrepo;
	}

	@Override
	public List<ManfacturerDto> listAllManfacturer() {
		List<ManfacturerDto> manfacturerList = new ArrayList<>();
		manrepo.findAllByOrderByManfacturerNameAsc().forEach(manfacturer -> {
			ManfacturerDto manfacturerModel = new ManfacturerDto();
			BeanUtils.copyProperties(manfacturer, manfacturerModel);
			manfacturerList.add(manfacturerModel);
		});

		return manfacturerList;
	}

	@Override
	public Manfacturer getManfacturerById(Long id) {
		System.out.println("****************" + id);
		return manrepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("manfacturer %d not found", id)));
	}

	@Override
	public Manfacturer save(Manfacturer manfacturer) {
		return manrepo.save(manfacturer);
	}

	@Override
	public boolean delete(Long id) {
		boolean status = false;
		Manfacturer manfacturer = getManfacturerById(id);
		if (manfacturer != null) {
			manrepo.delete(manfacturer);
			status = true;
		}
		return status;
	}

	@Override
	public Manfacturer create(Manfacturer manfacturer) {

		return manrepo.save(manfacturer);
	}

}
