package com.mms.kakfa_consumer;

import com.mms.kakfa_consumer.app.KafkaMessageConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class KafkaConsumerApplication {

	@Autowired
	static KafkaMessageConsumer kafkaMessageConsumer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);

	}

}
