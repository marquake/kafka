package com.mms.kakfa_consumer;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@EnableKafka
@Component
public class KafkaMessageConsumer {

	   @KafkaListener(topics = "${topic.name}", groupId = "${topic.group.id}")
	    public void listenTopic(String message) {
	        System.out.println("message: " + message);
	    }

}
