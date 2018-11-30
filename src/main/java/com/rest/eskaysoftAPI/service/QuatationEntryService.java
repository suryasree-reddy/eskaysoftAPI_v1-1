package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.model.QuatationEntryDto;

public interface QuatationEntryService {

	List<QuatationEntryDto> listAllQuatationEntry();

	QuatationEntryDto getquatationEntryById(Long id);

	QuatationEntryDto updatequatationEntry(QuatationEntryDto quatationEntry);

	boolean deletequatationEntryService(Long id);

	QuatationEntryDto create(QuatationEntryDto quatationEntry);
}
