package com.gabyferrari.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabyferrari.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	//query method para procurar no banco de dados um titulo de post contendo por ex "partiu"
	List<Post> findByTitleContainingIgnoreCase(String text); //ignoreCase serve para buscar sendo o titulo com letra maiuscula ou minuscula

}
