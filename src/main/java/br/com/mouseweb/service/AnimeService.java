package br.com.mouseweb.service;

import br.com.mouseweb.domain.Anime;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AnimeService {
    Flux<Anime> findAll();
    Mono<Anime> findById(int id);
    Mono<Anime> save(Anime anime);
    Mono<Void> update(Anime anime);
    Mono<Void> update2(Anime withId);
    Mono<Void> delete(int id);
}
