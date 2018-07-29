package com.rest.eskaysoftAPI.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Manfacturer;



@Repository ("manfacturerDao")
@Transactional
public interface ManfacturerDao extends JpaRepository<Manfacturer, Long> {

}