package jwt_test.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import jwt_test.entities.AuthUser;

public interface AuthUserRepository extends MongoRepository<AuthUser,String>{
	Optional<AuthUser >findByUsername(String username);

}
