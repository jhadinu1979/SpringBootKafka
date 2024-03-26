package com.sbkafka.SpringBootKafka.kafka;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.sbkafka.SpringBootKafka.payload.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER =LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics ="JsonJavaProgram", groupId = "topic")
	public void consume(User user) {
		
		LOGGER.info(String.format("Json Message Received: %s", user.toString()));
	}
}
