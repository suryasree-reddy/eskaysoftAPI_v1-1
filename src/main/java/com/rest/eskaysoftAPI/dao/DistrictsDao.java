package com.rest.eskaysoftAPI.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.eskaysoftAPI.entity.Districts;

public interface DistrictsDao extends JpaRepository<Districts, Long> {
	public List<Districts> findAllByOrderByDistrictNameAsc();
}