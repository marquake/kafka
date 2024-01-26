package com.mms.kakfa_producer;

import com.mms.kakfa_producer.app.ExecuteProducerApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);

		ExecuteProducerApp executeProducerApp = new ExecuteProducerApp();
		executeProducerApp.run();

	}


}