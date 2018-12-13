package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.entity.QuatationEntry;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.QuatationEntryDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.ProductRepository;
import com.rest.eskaysoftAPI.repository.QuatationEntryRepository;
import com.rest.eskaysoftAPI.service.QuatationEntryService;

@Service
public class QuatationEntryServiceImpl implements QuatationEntryService {

	@Autowired
	private QuatationEntryRepository qtRepo;
	@Autowired
	private AccountInformationRepository acreo;

	@Autowired
	private ProductRepository proRepo;;

	@Override
	public List<QuatationEntryDto> listAllQuatationEntry() {
		List<QuatationEntryDto> polist = new ArrayList<>();
		qtRepo.findAllByOrderByOrderNumberAsc().forEach(qto -> {
			QuatationEntryDto qtModel = new QuatationEntryDto();
			BeanUtils.copyProperties(qto, qtModel);
			qtModel.setProductId(qto.getProductId().getId());
			qtModel.setProductcode(qto.getProductId().getProductcode());
			qtModel.setProductName(qto.getProductId().getName());
			qtModel.setPacking(qto.getProductId().getPacking());
			qtModel.setAccountInformationId(qto.getAccountInformationId().getId());
			qtModel.setCustomer(qto.getAccountInformationId().getAccountName());

			polist.add(qtModel);
		});
		return polist;
	}

	@Override
	public QuatationEntryDto getquatationEntryById(Long id) {

		QuatationEntry qto = qtRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("QuatationEntry %d not found", id)));

		QuatationEntryDto qtModel = new QuatationEntryDto();
		BeanUtils.copyProperties(qto, qtModel);
		qtModel.setProductId(qto.getProductId().getId());
		qtModel.setProductcode(qto.getProductId().getProductcode());
		qtModel.setProductName(qto.getProductId().getName());
		qtModel.setPacking(qto.getProductId().getPacking());
		qtModel.setAccountInformationId(qto.getAccountInformationId().getId());
		qtModel.setCustomer(qto.getAccountInformationId().getAccountName());
		return qtModel;
	}

	@Override
	public QuatationEntryDto updatequatationEntry(QuatationEntryDto quatationEntry) {

		AccountInformation ai = acreo.findById(quatationEntry.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", quatationEntry.getAccountInformationId())));

		Product product = proRepo.findById(quatationEntry.getProductId()).orElseThrow(() -> new NotFoundException(
				String.format("quatationEntry %d not found", quatationEntry.getProductId())));

		QuatationEntry qt = new QuatationEntry();
		qt.setAccountInformationId(ai);
		qt.setProductId(product);
		BeanUtils.copyProperties(quatationEntry, qt);
		qt = qtRepo.save(qt);
		return quatationEntry;

	}

	@Override
	public boolean deletequatationEntryService(Long id) {
		boolean status = false;
		QuatationEntry qt = qtRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("QuatationEntry %d not found", id)));

		if (qt != null) {
			qtRepo.delete(qt);
			status = true;
		}
		return status;
	}

	@Override
	public QuatationEntryDto create(QuatationEntryDto quatationEntry) {
		QuatationEntry qt = new QuatationEntry();

		AccountInformation ai = acreo.findById(quatationEntry.getAccountInformationId())
				.orElseThrow(() -> new NotFoundException(
						String.format("AccountInformation %d not found", quatationEntry.getAccountInformationId())));

		Product product = proRepo.findById(quatationEntry.getProductId()).orElseThrow(() -> new NotFoundException(
				String.format("quatationEntry %d not found", quatationEntry.getProductId())));
		qt.setAccountInformationId(ai);
		qt.setProductId(product);
		BeanUtils.copyProperties(quatationEntry, qt);
		qt = qtRepo.save(qt);
		quatationEntry.setId(qt.getId());
		return quatationEntry;

	}

}
