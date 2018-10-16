package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Districts;

@Repository("districtsRepository")
@Transactional
public interface DistrictsRepository extends JpaRepository<Districts, Long> {
	public List<Districts> findAllByOrderByDistrictNameAsc();
	public List<Districts> findByStatesIdId(Long id);

}