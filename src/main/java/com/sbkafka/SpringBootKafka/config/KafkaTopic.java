package com.sbkafka.SpringBootKafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {
	@Bean 
	public NewTopic createTopics() {
		return TopicBuilder.name("JavaProgram")
				.build();
	}
	
	@Bean 
	public NewTopic jsonCreateTopics() {
		return TopicBuilder.name("JsonJavaProgram")
				.build();
	}
}
