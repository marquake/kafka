package com.mms.kakfa_producer;

import com.google.gson.Gson;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class KafkaProducerApplication {

	private static final String BOOTSTRAP_SERVERS = "http://localhost:9092";
	private static final String TOPIC = "topicUsuarios";

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);

		// Se crea el ejecutor planificado
		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		Producer<String, String> kafkaProducer = createKafkaProducer();

		// Programar la generación y envío de datos cada segundo
		executorService.scheduleAtFixedRate(() -> {
			String data = generateData();
			sendMessage(kafkaProducer, data);
		}, 0, 1, TimeUnit.SECONDS);
	}

	// Se crea el productor de Kafka y se le indica que la clave/valor van a ser Strings Serializadas.
	// Retorna el productor con las propiedades aplicadas.
	private static Producer<String, String> createKafkaProducer() {
		Properties props = new Properties();
		props.put("bootstrap.servers", BOOTSTRAP_SERVERS);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		return new KafkaProducer<>(props);
	}

	// Voy a generar identificadores aleatorios para escribir en la cola.
	private static String generateData() {
		//return UUID.randomUUID().toString();

		Usuario usuario = CreateUsuario.generateUsuario();

		Gson gson = new Gson();
		return gson.toJson(usuario);
	}

	// Realizo el envío enviando el productor y el dato.
	private static void sendMessage(Producer<String, String> producer, String data) {
		// Genero un ProducerRecord "registro producido", y con el producer hago el send.
		ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC, data);

		// Hago el envío, esto me retornará el FutureRecord<Metadata>, del que saco los datos
		// que me ha devuelto el broker.
		producer.send(record, (metadata, exception) -> {
			if (exception == null) {
				System.out.println("Topic: " + metadata.topic() + ", offset: " + metadata.offset() + " -> data: " + data);
			} else {
				System.err.println("Error al enviar mensaje: " + exception.getMessage());
			}
		});
	}



}