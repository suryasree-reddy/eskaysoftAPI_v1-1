package com.rest.eskaysoftAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.eskaysoftAPI.entity.CustomerWiseDiscounts;

public interface CustomerWiseDiscountsDao extends JpaRepository<CustomerWiseDiscounts, Long> {

}