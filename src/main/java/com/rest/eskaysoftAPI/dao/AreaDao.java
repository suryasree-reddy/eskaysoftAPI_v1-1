package com.rest.eskaysoftAPI.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Area;

@Repository("areaDao")
@Transactional
public interface AreaDao extends JpaRepository<Area, Long> {
	public List<Area> findAllByOrderByAreaNameAsc();

}