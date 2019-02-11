package com.rollingstone.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.rollingstone.model.ProductInfo;

public interface ProductInfoRepository extends PagingAndSortingRepository<ProductInfo, Long> {

	Page findAll(Pageable pageable);
	
}
