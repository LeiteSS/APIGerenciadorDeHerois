package io.github.leitess.HeroesManager.service;

import io.github.leitess.HeroesManager.document.Heroes;
import io.github.leitess.HeroesManager.repository.HeroesRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HeroesService {
    private final HeroesRepository heroesRepository;

    public Flux<Heroes> findAll() {
        return this.heroesRepository.findAll();
    }

    public Mono<Heroes> findById(ObjectId _id) {
        return this.heroesRepository.findById(_id);
    }

    public Mono<Heroes> save(Heroes heroes) {
        return this.heroesRepository.save(heroes);
    }

    public void deleteById(ObjectId _id) {
        heroesRepository.deleteById(_id);
    }
}
