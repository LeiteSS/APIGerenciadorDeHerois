package lab.aulaDIO.HeroesManager.repository;

import lab.aulaDIO.HeroesManager.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String> { }
