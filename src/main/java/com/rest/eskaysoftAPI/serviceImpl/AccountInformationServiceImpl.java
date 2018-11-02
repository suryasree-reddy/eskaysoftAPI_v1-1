package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.AccountInformation;
import com.rest.eskaysoftAPI.entity.Area;
import com.rest.eskaysoftAPI.entity.Districts;
import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.entity.SubSchedule;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.AccountInformationDto;
import com.rest.eskaysoftAPI.repository.AccountInformationRepository;
import com.rest.eskaysoftAPI.repository.AreaRepository;
import com.rest.eskaysoftAPI.repository.DistrictsRepository;
import com.rest.eskaysoftAPI.repository.ScheduleRepository;
import com.rest.eskaysoftAPI.repository.StatesRepository;
import com.rest.eskaysoftAPI.repository.SubScheduleRepository;
import com.rest.eskaysoftAPI.service.AccountInformationService;

@Service
public class AccountInformationServiceImpl implements AccountInformationService {

	@Autowired
	private AccountInformationRepository acinfrRepo;

	@Autowired
	private ScheduleRepository screpo;

	@Autowired
	private SubScheduleRepository subrepo;

	@Autowired
	private DistrictsRepository disrepo;

	@Autowired
	private StatesRepository staterepo;

	@Autowired
	private AreaRepository aerarepo;

	@Override
	public List<AccountInformationDto> listAllAccountInformation() {
		List<AccountInformationDto> ailist = new ArrayList<>();
		acinfrRepo.findAllByOrderByAccountNameAsc().forEach(ai -> {
			AccountInformationDto aimodel = new AccountInformationDto();
			BeanUtils.copyProperties(ai, aimodel);
			aimodel.setScheduleId(ai.getScheduleId().getId());
			aimodel.setScheduleName(ai.getScheduleId().getScheduleName());
			aimodel.setSubScheduleId(ai.getSubscheduleId().getId());
			aimodel.setSubScheduleName(ai.getSubscheduleId().getSubScheduleName());
			aimodel.setAreaId(ai.getAreaId().getId());
			aimodel.setAreaName(ai.getAreaId().getAreaName());
			aimodel.setDistrictId(ai.getDistrictId().getId());
			aimodel.setDistrictName(ai.getDistrictId().getDistrictName());
			aimodel.setStateId(ai.getStateId().getId());
			aimodel.setStateName(ai.getStateId().getStateName());
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
		aimodel.setScheduleId(ain.getScheduleId().getId());
		aimodel.setScheduleName(ain.getScheduleId().getScheduleName());
		aimodel.setSubScheduleId(ain.getSubscheduleId().getId());
		aimodel.setSubScheduleName(ain.getSubscheduleId().getSubScheduleName());
		aimodel.setStateId(ain.getStateId().getId());
		aimodel.setStateName(ain.getStateId().getStateName());
		aimodel.setAreaId(ain.getAreaId().getId());
		aimodel.setAreaName(ain.getAreaId().getAreaName());
		aimodel.setDistrictId(ain.getDistrictId().getId());
		aimodel.setDistrictName(ain.getDistrictId().getDistrictName());

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
		Schedule sc = screpo.findById(aimodel.getScheduleId()).orElseThrow(
				() -> new NotFoundException(String.format("Schedule %d not found", aimodel.getScheduleId())));
		ain.setScheduleId(sc);

		SubSchedule sb = subrepo.findById(aimodel.getSubScheduleId()).orElseThrow(
				() -> new NotFoundException(String.format("SubSchedule %d not found", aimodel.getSubScheduleId())));
		ain.setSubscheduleId(sb);
		Area area = aerarepo.findById(aimodel.getAreaId())
				.orElseThrow(() -> new NotFoundException(String.format("Districts %d not found", aimodel.getAreaId())));
		ain.setAreaId(area);
		Districts dis = disrepo.findById(aimodel.getDistrictId()).orElseThrow(
				() -> new NotFoundException(String.format("Districts %d not found", aimodel.getDistrictId())));
		ain.setDistrictId(dis);
		States st = staterepo.findById(aimodel.getStateId())
				.orElseThrow(() -> new NotFoundException(String.format("States %d not found", aimodel.getStateId())));
		ain.setStateId(st);

		BeanUtils.copyProperties(aimodel, ain);
		ain = acinfrRepo.save(ain);
		aimodel.setId(ain.getId());
		return aimodel;
	}

	@Override
	public AccountInformationDto updateai(AccountInformationDto accountInformation) {
		AccountInformation ai = new AccountInformation();
		Schedule sc = screpo.findById(accountInformation.getScheduleId()).orElseThrow(() -> new NotFoundException(
				String.format("Schedule %d not found", accountInformation.getScheduleId())));
		ai.setScheduleId(sc);
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
		States st = staterepo.findById(accountInformation.getStateId()).orElseThrow(
				() -> new NotFoundException(String.format("States %d not found", accountInformation.getStateId())));
		ai.setStateId(st);
		BeanUtils.copyProperties(accountInformation, ai);
		ai = acinfrRepo.save(ai);
		return accountInformation;
	}

}
