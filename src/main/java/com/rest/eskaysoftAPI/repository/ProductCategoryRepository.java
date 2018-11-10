package com.rest.eskaysoftAPI.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.ProductCategory;

@Repository("productCategoryRepository")
@Transactional
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	public List<ProductCategory> findAllByOrderByProductCategoryNameAsc();

	@Query(value = "SELECT pc.id, pc.product_category_name, "
			+ "  CASE WHEN pro.productcategory_id is NULL THEN 't' ELSE 'f' END AS delete_flag"
			+ "  FROM public.productcategory pc" + "  LEFT OUTER JOIN (SELECT distinct productcategory_id"
			+ "  FROM public.products) pro"
			+ "  ON pc.id=pro.productcategory_id ORDER BY pc.product_category_name ASC ", nativeQuery = true)
	public List<ProductCategory> getProductCategory();
}
