package com.rest.eskaysoftAPI.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.PurchaseEntryDao;
import com.rest.eskaysoftAPI.entity.PurchaseEntry;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.service.PurchaseEntryService;

@Service
public class PurchaseEntryServiceImpl implements PurchaseEntryService {

    private PurchaseEntryDao purchaseEntryDao;

    @Autowired
    public void setpurchaseEntryDao(PurchaseEntryDao purchaseEntryDao) {
        this.purchaseEntryDao = purchaseEntryDao;
    }


    @Override
    public Iterable<PurchaseEntry> listAllPurchaseEntries() {
        return purchaseEntryDao.findAll();
    }

    @Override
  	public PurchaseEntry getPurchaseEntryById(Long id) {
      	System.out.println("****************"+id);
  		return purchaseEntryDao.findById(id)
                  .orElseThrow(() -> new NotFoundException(String.format("product %d not found", id)));
      }


    @Override
    public PurchaseEntry savePurchaseEntry(PurchaseEntry purchaseEntry) {
        return purchaseEntryDao.save(purchaseEntry);
    }

    @Override
    public PurchaseEntry deletePurchaseEntry(Long id) {
    	PurchaseEntry purchaseEntry = getPurchaseEntryById(id);
        if(purchaseEntry != null){
        	purchaseEntryDao.delete(purchaseEntry);
        }
        return purchaseEntry;
    }


    @Override
    public PurchaseEntry create(PurchaseEntry purchaseEntry) {

            return purchaseEntryDao.save(purchaseEntry);
        }


}
