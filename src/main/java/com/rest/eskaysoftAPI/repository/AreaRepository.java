package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Area;

@Repository("areaRepository")
@Transactional
public interface AreaRepository extends JpaRepository<Area, Long> {
	public List<Area> findAllByOrderByAreaNameAsc();

	public List<Area> findByBusinessExecutiveIdId(Long id);

}