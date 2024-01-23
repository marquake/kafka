package com.mms.kakfa_producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class KafkaMessageProducer {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Value(value = "${topic.name}")
	private String topicName;

	public void sendMessage(String message) {
		
		System.out.println("topicName: " + topicName);
		
		kafkaTemplate.send(topicName, message);
	}
}
