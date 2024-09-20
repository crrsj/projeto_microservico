package com.microservico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservico.dto.CarPostDTO;
import com.microservico.message.KafkaProducerMessage;
import com.microservico.service.CarPostStoreService;

@RestController
@RequestMapping("/api/car")
public class CarPostController {

	@Autowired
	private CarPostStoreService carPostStoreService;
	
	@Autowired
	private KafkaProducerMessage kafkaProducerMessage;
	
	@GetMapping("/posts")
	public ResponseEntity<List<CarPostDTO>>getCarSales(){
		return ResponseEntity.status(HttpStatus.FOUND).body(carPostStoreService.getcarForSales());
	}
	
	@PostMapping
	public ResponseEntity postCarForSale(@RequestBody CarPostDTO carPostDTO) {
		kafkaProducerMessage.sendMessage(carPostDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity changeCarSales(@RequestBody CarPostDTO carPostDTO,@PathVariable ("id" ) String id) {
		carPostStoreService.changeCarForSale(carPostDTO, id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteCarForSales(@PathVariable( "{id}") String id) {
		carPostStoreService.removeCarForSale(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
