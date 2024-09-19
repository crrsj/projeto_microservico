package com.microservico.service;

import org.springframework.stereotype.Service;


import com.microservico.dto.OwnerPostDTO;

@Service
public interface OwnerPostService {

	void createOwnerCar(OwnerPostDTO ownerPostDTO);
}
