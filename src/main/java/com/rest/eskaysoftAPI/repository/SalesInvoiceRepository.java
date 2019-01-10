package com.rest.eskaysoftAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.eskaysoftAPI.entity.SalesInvoice;

public interface SalesInvoiceRepository extends JpaRepository<SalesInvoice, Long> {

	public List<SalesInvoice> findAllByOrderBySalesInvNoAsc();

	public List<SalesInvoice> findBySalesInvNo(Integer id);

}
