package com.rest.eskaysoftAPI;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rest.eskaysoftAPI.resource.AccountInformationResource;
import com.rest.eskaysoftAPI.resource.AreaResource;
import com.rest.eskaysoftAPI.resource.BankInformationResource;
import com.rest.eskaysoftAPI.resource.BusinessExecutiveResource;
import com.rest.eskaysoftAPI.resource.CompanyGroupResource;
import com.rest.eskaysoftAPI.resource.CompanyResource;
import com.rest.eskaysoftAPI.resource.CustomerWiseDiscountsResource;
import com.rest.eskaysoftAPI.resource.DistrictsResource;
import com.rest.eskaysoftAPI.resource.GSTChallanResource;
import com.rest.eskaysoftAPI.resource.InternalStockAdjustmentsResource;
import com.rest.eskaysoftAPI.resource.ManfacturerResource;
import com.rest.eskaysoftAPI.resource.ProductCategoryResource;
import com.rest.eskaysoftAPI.resource.ProductGroupResource;
import com.rest.eskaysoftAPI.resource.ProductResource;
import com.rest.eskaysoftAPI.resource.PurchaseEntryResource;
import com.rest.eskaysoftAPI.resource.PurchaseOrderResource;
import com.rest.eskaysoftAPI.resource.PurchaseReturnsResource;
import com.rest.eskaysoftAPI.resource.QuatationEntryResource;
import com.rest.eskaysoftAPI.resource.SalesInvoiceResource;
import com.rest.eskaysoftAPI.resource.SalesOrderResource;
import com.rest.eskaysoftAPI.resource.SalesReturnsResource;
import com.rest.eskaysoftAPI.resource.ScheduleResource;
import com.rest.eskaysoftAPI.resource.StatesResource;
import com.rest.eskaysoftAPI.resource.SubScheduleResource;
import com.rest.eskaysoftAPI.resource.TaxResource;

@Component
@ApplicationPath("/api/v1")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		register(ProductResource.class);
		register(CompanyResource.class);
		register(StatesResource.class);
		register(AccountInformationResource.class);
		register(AreaResource.class);
		register(BankInformationResource.class);
		register(CompanyGroupResource.class);
		register(ScheduleResource.class);
		register(BusinessExecutiveResource.class);
		register(ProductCategoryResource.class);
		register(ProductGroupResource.class);
		register(PurchaseEntryResource.class);
		register(SubScheduleResource.class);
		register(CustomerWiseDiscountsResource.class);
		register(ManfacturerResource.class);
		register(DistrictsResource.class);
		register(TaxResource.class);
		register(PurchaseOrderResource.class);
		register(PurchaseReturnsResource.class);
		register(SalesOrderResource.class);
		register(InternalStockAdjustmentsResource.class);
		register(GSTChallanResource.class);
		register(QuatationEntryResource.class);
		register(SalesReturnsResource.class);
		register(SalesInvoiceResource.class);

	}
}
