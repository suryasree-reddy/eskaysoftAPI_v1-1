package com.rest.eskaysoftAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.eskaysoftAPI.entity.SalesOrder;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long> {

	public List<SalesOrder> findAllByOrderByOrderNumberAsc();

	public List<SalesOrder> findByOrderNumber(Integer id);

}
