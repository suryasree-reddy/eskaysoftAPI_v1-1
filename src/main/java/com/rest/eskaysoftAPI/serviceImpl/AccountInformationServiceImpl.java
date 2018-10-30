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
		acinfrRepo.findAllByOrderByAccountnameAsc().forEach(ai -> {
			AccountInformationDto aimodel = new AccountInformationDto();
			BeanUtils.copyProperties(ai, aimodel);
			aimodel.setScheduleId(ai.getScheduleId().getId());
			aimodel.setScheduleName(ai.getScheduleId().getScheduleName());
			aimodel.setSubScheduleId(ai.getSubscheduleId().getId());
			aimodel.setSubScheduleName(ai.getSubscheduleId().getSubScheduleName());
			aimodel.setAreaId(ai.getAreaId().getId());
			aimodel.setAreaName(ai.getAreaId().getAreaName());
			aimodel.setDistrictsId(ai.getDistrictsId().getId());
			aimodel.setDistrictName(ai.getDistrictsId().getDistrictName());
			aimodel.setStatesId(ai.getStatesId().getId());
			aimodel.setStateName(ai.getStatesId().getStateName());
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
		aimodel.setStatesId(ain.getStatesId().getId());
		aimodel.setStateName(ain.getStatesId().getStateName());
		aimodel.setAreaId(ain.getAreaId().getId());
		aimodel.setAreaName(ain.getAreaId().getAreaName());
		aimodel.setDistrictsId(ain.getDistrictsId().getId());
		aimodel.setDistrictName(ain.getDistrictsId().getDistrictName());

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
		List<AccountInformation> aiList = new ArrayList<>();
		aiList = acinfrRepo.findByscheduleIdId(ai.getScheduleId().getId());
		aiList = acinfrRepo.findBysubScheduleIdId(ai.getSubscheduleId().getId());
		aiList = acinfrRepo.findByStatesIdId(ai.getStatesId().getId());
		aiList = acinfrRepo.findBydistrictsIdId(ai.getDistrictsId().getId());
		aiList = acinfrRepo.findByareaIdId(ai.getAreaId().getId());

		if (null == aiList || aiList.isEmpty()) {
			Schedule sc = ai.getScheduleId();
			sc.setDeleteFlag(true);
			screpo.save(sc);
			SubSchedule sb = ai.getSubscheduleId();
			sb.setDeleteFlag(true);
			subrepo.save(sb);
			Area area = ai.getAreaId();
			area.setDeleteFlag(true);
			aerarepo.save(area);
			States states = ai.getStatesId();
			states.setDeleteFlag(true);
			staterepo.save(states);
			Districts ds = ai.getDistrictsId();
			ds.setDeleteFlag(true);
			disrepo.save(ds);

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
		Districts dis = disrepo.findById(aimodel.getDistrictsId()).orElseThrow(
				() -> new NotFoundException(String.format("Districts %d not found", aimodel.getDistrictsId())));
		ain.setDistrictsId(dis);
		States st = staterepo.findById(aimodel.getStatesId())
				.orElseThrow(() -> new NotFoundException(String.format("States %d not found", aimodel.getStatesId())));
		ain.setStatesId(st);

		BeanUtils.copyProperties(aimodel, ain);
		ain.setId(ain.getId());
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
		Districts dis = disrepo.findById(accountInformation.getDistrictsId()).orElseThrow(() -> new NotFoundException(
				String.format("Districts %d not found", accountInformation.getDistrictsId())));
		ai.setDistrictsId(dis);
		States st = staterepo.findById(accountInformation.getStatesId()).orElseThrow(
				() -> new NotFoundException(String.format("States %d not found", accountInformation.getStatesId())));
		ai.setStatesId(st);
		BeanUtils.copyProperties(accountInformation, ai);
		ai = acinfrRepo.save(ai);
		return accountInformation;
	}

}
