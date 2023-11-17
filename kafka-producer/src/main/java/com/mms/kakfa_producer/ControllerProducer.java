package com.mms.kakfa_producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerProducer {

   @Autowired
   KafkaMessageProducer kafkaMessageProducer;

	@GetMapping("/test")
	public String test() {

		System.out.println("ejecutando test");
		try {
			kafkaMessageProducer.sendMessage("primera prueba");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "ok";
	}
	
}
