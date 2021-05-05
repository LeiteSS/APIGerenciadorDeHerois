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

    public Mono<Heroes> findByName(String name) {
        return this.heroesRepository.findByName(name);
    }

    public Mono<Heroes> save(Heroes heroes) {
        return this.heroesRepository.save(heroes);
    }

    public Mono<Boolean> deleteById(ObjectId id) {
        heroesRepository.deleteById(id);
        return Mono.just(true);
    }
}
