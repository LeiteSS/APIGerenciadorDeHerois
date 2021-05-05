package io.github.leitess.HeroesManager.resource;

import io.github.leitess.HeroesManager.constans.HeroesConstant;
import io.github.leitess.HeroesManager.document.Heroes;
import io.github.leitess.HeroesManager.service.HeroesService;
import io.github.leitess.HeroesManager.repository.HeroesRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
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
@CrossOrigin("https://app-for-heroes.netlify.app")
@RequestMapping("/api/v1")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HeroesResource {
    private final HeroesService heroesService;

    private static final org.slf4j.Logger log= org.slf4j.LoggerFactory.getLogger(HeroesResource.class);

    @GetMapping("/heroes")
    public Flux<Heroes> getAllItems() {
        log.info("Requesting the list off all heroes.");
        return heroesService.findAll();
    }

    @GetMapping("/heroes/{_id}")
    public Mono<ResponseEntity<Heroes>> findById(@PathVariable ObjectId _id) {
        log.info("Requesqting the hero with name {}.", _id);
        return heroesService.findById(_id)
                .map((item) -> new ResponseEntity<>(item, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/heroes")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Mono<Heroes> create(@RequestBody Heroes heroes) {
        log.info("A new hero was created.");
        return heroesService.save(heroes);
    }

    @DeleteMapping("/heroes/{_id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable ObjectId _id) {
        heroesService.deleteById(_id);
        log.info("Delete a hero with id {}", _id);
    }
}
