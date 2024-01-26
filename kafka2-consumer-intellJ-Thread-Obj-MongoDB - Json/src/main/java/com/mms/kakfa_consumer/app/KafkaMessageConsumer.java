package com.mms.kakfa_consumer.app;

import com.mms.kakfa_consumer.entity.Usuario;
import com.mms.kakfa_consumer.repository.UsuarioRepository;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@EnableKafka
@Component
public class KafkaMessageConsumer {

	private UsuarioRepository usuarioRepository;
	public KafkaMessageConsumer( UsuarioRepository usuarioRepository){
		this.usuarioRepository = usuarioRepository;
	}

	//@KafkaListener(topics = "${topic.name}", groupId = "${topic.group.id}")
	@KafkaListener(topics = "${topic.name}", groupId = "${topic.group.id}")
	    public void listenTopic(String message) {
	        System.out.println("message Json: " + message);

			Gson gson = new Gson();
			Usuario usuario = gson.fromJson(message, Usuario.class);
			//System.out.println("usuario message: " + usuario.toString());

			Usuario usuarioSaved = usuarioRepository.save(usuario);
			//System.out.println("usuarioSaved: " + usuarioSaved.toString());
	    }
}
