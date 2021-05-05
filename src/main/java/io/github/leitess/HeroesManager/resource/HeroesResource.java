package io.github.leitess.HeroesManager.controller;

import io.github.leitess.HeroesManager.constans.HeroesConstant;
import io.github.leitess.HeroesManager.document.Heroes;
import io.github.leitess.HeroesManager.service.HeroesService;
import io.github.leitess.HeroesManager.repository.HeroesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/heroes")
public class HeroesController {
    HeroesService heroesService;
    HeroesRepository heroesRepository;
    private static final org.slf4j.Logger log= org.slf4j.LoggerFactory.getLogger(HeroesController.class);

    public HeroesController (HeroesService heroesService, HeroesRepository heroesRepository) {
        this.heroesRepository = heroesRepository;
        this.heroesService = heroesService;
    }
    @GetMapping(HeroesConstant.HEROES_ENDPOINT_LOCAL)
    public Flux<Heroes> getAllItems() {
        log.info("Requesting the list off all heroes.");
        return heroesService.findAll();
    }

    @GetMapping(HeroesConstant.HEROES_ENDPOINT_LOCAL+"/id")
    public Mono<ResponseEntity<Heroes>> findById(@PathVariable String id) {
        log.info("Requesqting the hero with id {}.", id);
        return heroesService.findById(id)
                .map((item) -> new ResponseEntity<>(item, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(HeroesConstant.HEROES_ENDPOINT_LOCAL)
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<Heroes> create(@RequestBody Heroes heroes) {
        log.info("A new hero was created.");
        return heroesService.save(heroes);
    }

    @DeleteMapping(HeroesConstant.HEROES_ENDPOINT_LOCAL+"/id")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public Mono<HttpStatus> deleteById(@PathVariable String id) {
        heroesService.deleteById(id);
        log.info("Delete a hero with id {}", id);
        return Mono.just(HttpStatus.NOT_FOUND);
    }
}
