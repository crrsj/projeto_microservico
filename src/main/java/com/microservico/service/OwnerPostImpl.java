package com.microservico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservico.client.CarPostStoreClient;

import com.microservico.dto.OwnerPostDTO;

@Service
public class OwnerPostImpl implements OwnerPostService {
   
	@Autowired
	private CarPostStoreClient carPostStoreClient;

	@Override
	public void createOwnerCar(OwnerPostDTO ownerPostDTO) {
	carPostStoreClient.ownerPostClient(ownerPostDTO);
		
	}
	
	
	
}
