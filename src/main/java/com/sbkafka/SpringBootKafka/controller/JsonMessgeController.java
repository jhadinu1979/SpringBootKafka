package com.sbkafka.SpringBootKafka.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbkafka.SpringBootKafka.kafka.JsonKafkaProducer;
import com.sbkafka.SpringBootKafka.payload.User;

@RestController
@RequestMapping("/api/v1/kafka")//Base url
public class JsonMessgeController {

	private JsonKafkaProducer jsonKafkaProducer;

	public JsonMessgeController(JsonKafkaProducer jsonKafkaProducer) {		
		this.jsonKafkaProducer = jsonKafkaProducer;
	}
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user){
		jsonKafkaProducer.SendMessage(user);
	    return ResponseEntity.ok("Json Message sent to the Topic");
		
	}
	
}
