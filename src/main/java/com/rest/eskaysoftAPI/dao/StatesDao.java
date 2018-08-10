package com.rest.eskaysoftAPI.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.States;

@Repository("statesDao")
@Transactional
public interface StatesDao extends JpaRepository<States, Long> {
	public List<States> findAllByOrderByStateNameAsc();

}