package io.github.leitess.HeroesManager.repository;

import io.github.leitess.HeroesManager.document.Heroes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface HeroesRepository extends ReactiveMongoRepository<Heroes, ObjectId> {

    @Query(value = "{ 'heroes.name' : ?0 }")
    Mono<Heroes> findByName(String name);
}