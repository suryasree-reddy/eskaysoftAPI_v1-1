package com.rest.eskaysoftAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.eskaysoftAPI.entity.GSTChallanEntry;

public interface GSTChallanRepository extends JpaRepository<GSTChallanEntry, Long> {

	public List<GSTChallanEntry> findAllByOrderByDcNoAsc();

	public List<GSTChallanEntry> findByDcNo(Integer id);

}
