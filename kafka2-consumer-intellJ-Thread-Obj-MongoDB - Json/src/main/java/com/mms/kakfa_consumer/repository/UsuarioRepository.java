package com.mms.kakfa_consumer.repository;

import com.mms.kakfa_consumer.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
