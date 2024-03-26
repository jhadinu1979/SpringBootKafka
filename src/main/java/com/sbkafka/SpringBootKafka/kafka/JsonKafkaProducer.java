package com.sbkafka.SpringBootKafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.sbkafka.SpringBootKafka.payload.User;

@Service
public class JsonKafkaProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

	private KafkaTemplate<String, User> kafkaTemplate;

	JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	
	public void SendMessage(User user) {
		LOGGER.info("Message Send: ", user.toString());
		Message<User> message = MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC, "JavaProgram").build();
		kafkaTemplate.send(message);
	}
}
