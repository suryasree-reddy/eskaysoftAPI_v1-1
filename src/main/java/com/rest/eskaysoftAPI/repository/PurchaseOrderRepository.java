package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.PurchaseOrder;

@Repository("purchaseOrderRepository")
@Transactional
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
	public List<PurchaseOrder> findAllByOrderByOrderNumberAsc();
	
	public List<PurchaseOrder> findByOrderNumber(Integer id);

	public PurchaseOrder findByProductIdIdAndAccountInformationIdId(Long proId, Long AcctId);

	public List<PurchaseOrder> findByAccountInformationIdIdOrderByOrderNumberAsc(Long id);

	public List<PurchaseOrder> findByProductIdIdOrderByOrderNumberAsc(Long id);

}
