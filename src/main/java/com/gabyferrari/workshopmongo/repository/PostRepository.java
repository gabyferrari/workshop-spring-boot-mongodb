package com.gabyferrari.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.gabyferrari.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	//@Query permite q possamos entrar com a consulta do mongoD na forma de texto json
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }") //?0 valor do parametro, o 0 é o primeiro parametro q for no metodo, e o 'i' é para ignorar maiusculas e minusculas
	List<Post> searchTitle(String text);
	
	//query method para procurar no banco de dados um titulo de post contendo por ex "partiu"
	List<Post> findByTitleContainingIgnoreCase(String text); //ignoreCase serve para buscar sendo o titulo com letra maiuscula ou minuscula

}
