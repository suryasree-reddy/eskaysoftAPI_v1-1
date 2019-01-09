package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.QuatationEntry;

@Repository("quatationEntryRepository")
@Transactional
public interface QuatationEntryRepository extends JpaRepository<QuatationEntry, Long> {
	public List<QuatationEntry> findAllByOrderByOrderNumberAsc();

	public List<QuatationEntry> findByOrderNumber(Integer id);
}
