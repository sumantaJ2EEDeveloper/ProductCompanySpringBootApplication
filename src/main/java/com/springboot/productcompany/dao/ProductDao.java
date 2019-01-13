package com.springboot.productcompany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.productcompany.ProductInfo;

public interface ProductDao extends JpaRepository<ProductInfo,Integer> {
	
	

}
