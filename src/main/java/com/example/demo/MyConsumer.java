package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyConsumer {

	private static final Logger logger = LoggerFactory.getLogger(MyConsumer.class);
	private static final String TOPIC = "users";

	@KafkaListener(topics = TOPIC , groupId = "group_id" )
	public void consumer(String message) {
		logger.info(String.format("$$ -> Consuming message --> %s", message));

	}
}
