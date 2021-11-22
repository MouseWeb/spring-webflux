package br.com.mouseweb.repository;

import br.com.mouseweb.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {

}
