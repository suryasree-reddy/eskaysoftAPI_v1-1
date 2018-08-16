package com.rest.eskaysoftAPI.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.entity.PurchaseEntry;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.repository.PurchaseEntryRepository;
import com.rest.eskaysoftAPI.service.PurchaseEntryService;

@Service
public class PurchaseEntryServiceImpl implements PurchaseEntryService {

	private PurchaseEntryRepository purchrepo;

	@Autowired
	public void setpurchaseEntryDao(PurchaseEntryRepository purchrepo) {
		this.purchrepo = purchrepo;
	}

	@Override
	public Iterable<PurchaseEntry> listAllPurchaseEntries() {
		return purchrepo.findAll();
	}

	@Override
	public PurchaseEntry getPurchaseEntryById(Long id) {
		System.out.println("****************" + id);
		return purchrepo.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("product %d not found", id)));
	}

	@Override
	public PurchaseEntry savePurchaseEntry(PurchaseEntry purchaseEntry) {
		return purchrepo.save(purchaseEntry);
	}

	@Override
    public boolean deletePurchaseEntry(Long id) {
    	boolean status = false;
    	PurchaseEntry purchaseEntry = getPurchaseEntryById(id);
        if(purchaseEntry != null){
        	purchrepo.delete(purchaseEntry);
        	status = true;
        }
        return status;
    }




	@Override
	public PurchaseEntry create(PurchaseEntry purchaseEntry) {

		return purchrepo.save(purchaseEntry);
	}

}
