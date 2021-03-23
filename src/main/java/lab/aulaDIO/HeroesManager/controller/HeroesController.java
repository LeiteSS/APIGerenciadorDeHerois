package lab.aulaDIO.HeroesManager.controller;

import lab.aulaDIO.HeroesManager.document.Heroes;
import lab.aulaDIO.HeroesManager.repository.HeroesRepository;
import lab.aulaDIO.HeroesManager.service.HeroesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static lab.aulaDIO.HeroesManager.constans.HeroesConstant.HEROES_ENDPOINT_LOCAL;

@RestController
public class HeroesController {
    HeroesService heroesService;
    HeroesRepository heroesRepository;
    private static final org.slf4j.Logger log= org.slf4j.LoggerFactory.getLogger(HeroesController.class);

    public HeroesController (HeroesService heroesService, HeroesRepository heroesRepository) {
        this.heroesRepository = heroesRepository;
        this.heroesService = heroesService;
    }
    @GetMapping(HEROES_ENDPOINT_LOCAL)
    public Flux<Heroes> getAllItems() {
        log.info("Requesting the list off all heroes.");
        return heroesService.findAll();
    }

    @GetMapping(HEROES_ENDPOINT_LOCAL+"/id")
    public Mono<ResponseEntity<Heroes>> findById(@PathVariable String id) {
        log.info("Requesqting the hero with id {}.", id);
        return heroesService.findById(id)
                .map((item) -> new ResponseEntity<>(item, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(HEROES_ENDPOINT_LOCAL)
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<Heroes> create(@RequestBody Heroes heroes) {
        log.info("A new hero was created.");
        return heroesService.save(heroes);
    }

    @DeleteMapping(HEROES_ENDPOINT_LOCAL+"/id")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public Mono<HttpStatus> deleteById(@PathVariable String id) {
        heroesService.deleteById(id);
        log.info("Delete a hero with id {}", id);
        return Mono.just(HttpStatus.NOT_FOUND);
    }
}
