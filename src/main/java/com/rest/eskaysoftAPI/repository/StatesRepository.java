package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.States;

@Repository("statesRepository")
@Transactional
public interface StatesRepository extends JpaRepository<States, Long> {
	public List<States> findAllByOrderByStateNameAsc();

}