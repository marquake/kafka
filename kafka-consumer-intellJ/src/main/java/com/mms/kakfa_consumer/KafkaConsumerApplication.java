package com.mms.kakfa_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaConsumerApplication {

	@Autowired
	static KafkaMessageConsumer kafkaMessageConsumer;
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
		
//		runConsumer();
	}

//	private static void runConsumer() {
//		kafkaMessageConsumer.listenTopic(null);
//	}
	
}
