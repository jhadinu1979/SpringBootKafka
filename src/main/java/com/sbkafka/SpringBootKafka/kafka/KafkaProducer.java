package com.sbkafka.SpringBootKafka.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	private static Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	KafkaProducer(KafkaTemplate<String, String> kafkaTemplate){
		this.kafkaTemplate = kafkaTemplate;
	}

	
	public void sendMessage(String message) {
		kafkaTemplate.send("JavaProgram", message);
		LOGGER.info("Message Sent: ", message);
	}
}
