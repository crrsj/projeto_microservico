package com.microservico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservico.client.CarPostStoreClient;
import com.microservico.dto.CarPostDTO;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService{
	
	@Autowired
	private CarPostStoreClient carPostStoryClient;

	@Override
	public List<CarPostDTO> getcarForSales() {
		
		return carPostStoryClient.carForSaleClient();
	}

	@Override
	public void changeCarForSale(CarPostDTO carPostDTO, String id) {
		carPostStoryClient.changeCarForSaleClient(carPostDTO, id);
		
	}

	@Override
	public void removeCarPostDto(String id) {
		carPostStoryClient.deletecarForSaleClient(id);
		
	}

}
