package com.rest.eskaysoftAPI;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rest.eskaysoftAPI.resource.AccountInformationResource;
import com.rest.eskaysoftAPI.resource.AccountOpeningsResource;
import com.rest.eskaysoftAPI.resource.AreaResource;
import com.rest.eskaysoftAPI.resource.BankInformationResource;
import com.rest.eskaysoftAPI.resource.BusinessExecutiveResource;
import com.rest.eskaysoftAPI.resource.CompanyGroupResource;
import com.rest.eskaysoftAPI.resource.CompanyResource;
import com.rest.eskaysoftAPI.resource.CustomerWiseDiscountsResource;
import com.rest.eskaysoftAPI.resource.DistrictsResource;
import com.rest.eskaysoftAPI.resource.ManfacturerResource;
import com.rest.eskaysoftAPI.resource.ProductCategoryResource;
import com.rest.eskaysoftAPI.resource.ProductGroupResource;
import com.rest.eskaysoftAPI.resource.ProductResource;
import com.rest.eskaysoftAPI.resource.PurchaseEntryResource;
import com.rest.eskaysoftAPI.resource.ScheduleResource;
import com.rest.eskaysoftAPI.resource.StatesResource;
import com.rest.eskaysoftAPI.resource.SubScheduleResource;

@Component
@ApplicationPath("/api/v1")
public class AppConfig extends ResourceConfig {

	public AppConfig() {
		register(ProductResource.class);
		register(StatesResource.class);
		register(AccountInformationResource.class);
		register(AreaResource.class);
		register(BankInformationResource.class);
		register(CompanyResource.class);
		register(CompanyGroupResource.class);
		register(ScheduleResource.class);
		register(BusinessExecutiveResource.class);
		register(ProductCategoryResource.class);
		register(ProductGroupResource.class);
		register(PurchaseEntryResource.class);
		register(SubScheduleResource.class);
		register(AccountOpeningsResource.class);
		register(CustomerWiseDiscountsResource.class);
		register(ManfacturerResource.class);
		register(DistrictsResource.class);
	}
}
