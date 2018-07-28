package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.PurchaseEntry;

public interface PurchaseEntryService {

    Iterable<PurchaseEntry> listAllPurchaseEntries();

    PurchaseEntry getPurchaseEntryById(Long id);

    PurchaseEntry savePurchaseEntry(PurchaseEntry purchaseEntry);

    boolean deletePurchaseEntry(Long id);

    PurchaseEntry create(PurchaseEntry purchaseEntry);
}