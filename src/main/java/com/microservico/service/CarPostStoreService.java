package com.microservico.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservico.dto.CarPostDTO;

@Service
public interface CarPostStoreService {

	List<CarPostDTO>getcarForSales();
	
	void changeCarForSale(CarPostDTO carPostDTO, String id);
	
	void removeCarForSale(String id);
}
