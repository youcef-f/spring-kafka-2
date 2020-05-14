package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	@Autowired
	private  MyProducer myProducer;

	@PostMapping(value = "/publish")
	public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
		myProducer.sendMessage(message);
	}
}
