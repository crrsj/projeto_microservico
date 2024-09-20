package com.microservico.message;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.microservico.dto.CarPostDTO;

@Component
public class KafkaProducerMessage {

	private KafkaTemplate<String, CarPostDTO>kafkaTemplate;
	
	private final String KAFKA_TOPIC = "car-post-topic";
	
	public void sendMessage(CarPostDTO carPostDTO) {
		kafkaTemplate.send(KAFKA_TOPIC,carPostDTO);
	}
}
