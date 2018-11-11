package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Area;
import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;
import com.rest.eskaysoftAPI.entity.Districts;
import com.rest.eskaysoftAPI.entity.SubSchedule;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.AccountInformationDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.AreaRepository;
import com.rest.eskaysoftAPI.repository.CustomerWiseDiscountsRepository;
import com.rest.eskaysoftAPI.repository.DistrictsRepository;
import com.rest.eskaysoftAPI.repository.SubScheduleRepository;
import com.rest.eskaysoftAPI.service.AccountInformationService;
import com.rest.eskaysoftAPI.util.EskaysoftConstants;

@Service
public class AccountInformationServiceImpl implements AccountInformationService {

	@Autowired
	private AccountInformationRepository acinfrRepo;

	@Autowired
	private SubScheduleRepository subrepo;

	@Autowired
	private DistrictsRepository disrepo;

	@Autowired
	private AreaRepository aerarepo;
	
	@Autowired
	private CustomerWiseDiscountsRepository cuswiserepo;


	@Override
	public List<AccountInformationDto> listAllAccountInformation() {
		List<AccountInformationDto> ailist = new ArrayList<>();
		acinfrRepo.findAllByOrderByAccountNameAsc().forEach(ai -> {
			AccountInformationDto aimodel = new AccountInformationDto();
			BeanUtils.copyProperties(ai, aimodel);
			aimodel.setDeleteFlag(true);
			List<CustomerWiseDiscounts> cwdList = cuswiserepo.findByAccountInformationIdIdOrderByDiscAsc(ai.getId());
			if(null != cwdList && !cwdList.isEmpty()) {
				aimodel.setDeleteFlag(false);
			}
			aimodel.setScheduleName(ai.getSubscheduleId().getScheduleId().getScheduleName());
			aimodel.setScheduleId(ai.getSubscheduleId().getScheduleId().getId());
			aimodel.setSubScheduleId(ai.getSubscheduleId().getId());
			aimodel.setSubScheduleName(ai.getSubscheduleId().getSubScheduleName());
			aimodel.setAreaId(ai.getAreaId().getId());
			aimodel.setAreaName(ai.getAreaId().getAreaName());
			aimodel.setBusinessExecutiveId(ai.getAreaId().getBusinessExecutiveId().getId());
			aimodel.setBusinessExecutiveName(ai.getAreaId().getBusinessExecutiveId().getName());
			aimodel.setDistrictId(ai.getDistrictId().getId());
			aimodel.setDistrictName(ai.getDistrictId().getDistrictName());
			aimodel.setStateId(ai.getDistrictId().getStateId().getId());
			aimodel.setStateName(ai.getDistrictId().getStateId().getStateName());
			aimodel.setTypeheadDisplay(ai.getAccountName()+EskaysoftConstants.SEPERATOR +ai.getShortName()+EskaysoftConstants.SEPERATOR +ai.getTown());
			
			ailist.add(aimodel);
		});

		return ailist;
	}

	@Override
	public AccountInformationDto getAccountInformationById(Long id) {

		AccountInformation ain = acinfrRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("AccountInformation %d not found", id)));
		AccountInformationDto aimodel = new AccountInformationDto();
		BeanUtils.copyProperties(ain, aimodel);

		aimodel.setSubScheduleId(ain.getSubscheduleId().getId());
		aimodel.setSubScheduleName(ain.getSubscheduleId().getSubScheduleName());
		aimodel.setScheduleId(ain.getSubscheduleId().getScheduleId().getId());
		aimodel.setScheduleName(ain.getSubscheduleId().getScheduleId().getScheduleName());
		aimodel.setAreaId(ain.getAreaId().getId());
		aimodel.setAreaName(ain.getAreaId().getAreaName());
		aimodel.setBusinessExecutiveId(ain.getAreaId().getBusinessExecutiveId().getId());
		aimodel.setBusinessExecutiveName(ain.getAreaId().getBusinessExecutiveId().getName());
		aimodel.setDistrictId(ain.getDistrictId().getId());
		aimodel.setDistrictName(ain.getDistrictId().getDistrictName());
		aimodel.setStateName(ain.getDistrictId().getStateId().getStateName());
		aimodel.setStateId(ain.getDistrictId().getStateId().getId());
		return aimodel;
	}

	@Override
	public boolean deleteAccountInformation(Long id) {
		boolean status = false;
		AccountInformation ai = acinfrRepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("AccountInformation %d not found", id)));
		if (ai != null) {
			acinfrRepo.delete(ai);
			status = true;
		}

		return status;
	}

	@Override
	public AccountInformationDto create(AccountInformationDto aimodel) {
		AccountInformation ain = new AccountInformation();

		SubSchedule sb = subrepo.findById(aimodel.getSubScheduleId()).orElseThrow(
				() -> new NotFoundException(String.format("SubSchedule %d not found", aimodel.getSubScheduleId())));
		ain.setSubscheduleId(sb);
		Area area = aerarepo.findById(aimodel.getAreaId())
				.orElseThrow(() -> new NotFoundException(String.format("Districts %d not found", aimodel.getAreaId())));
		ain.setAreaId(area);
		Districts dis = disrepo.findById(aimodel.getDistrictId()).orElseThrow(
				() -> new NotFoundException(String.format("Districts %d not found", aimodel.getDistrictId())));
		ain.setDistrictId(dis);

		BeanUtils.copyProperties(aimodel, ain);
		ain = acinfrRepo.save(ain);
		aimodel.setId(ain.getId());
		return aimodel;
	}

	@Override
	public AccountInformationDto updateai(AccountInformationDto accountInformation) {
		AccountInformation ai = new AccountInformation();

		SubSchedule sb = subrepo.findById(accountInformation.getSubScheduleId())
				.orElseThrow(() -> new NotFoundException(
						String.format("SubSchedule %d not found", accountInformation.getSubScheduleId())));
		ai.setSubscheduleId(sb);
		Area area = aerarepo.findById(accountInformation.getAreaId()).orElseThrow(
				() -> new NotFoundException(String.format("Districts %d not found", accountInformation.getAreaId())));
		ai.setAreaId(area);
		Districts dis = disrepo.findById(accountInformation.getDistrictId()).orElseThrow(() -> new NotFoundException(
				String.format("Districts %d not found", accountInformation.getDistrictId())));
		ai.setDistrictId(dis);

		BeanUtils.copyProperties(accountInformation, ai);
		ai = acinfrRepo.save(ai);
		return accountInformation;
	}

}
