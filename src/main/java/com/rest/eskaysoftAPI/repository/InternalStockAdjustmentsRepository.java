package com.rest.eskaysoftAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.eskaysoftAPI.entity.InternalStockAdjustments;

public interface InternalStockAdjustmentsRepository extends JpaRepository<InternalStockAdjustments, Long> {

	public List<InternalStockAdjustments> findAllByOrderByNumberAsc();

}
