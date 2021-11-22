package br.com.mouseweb.controller;

import br.com.mouseweb.domain.Anime;
import br.com.mouseweb.service.AnimeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("animes")
@Slf4j
@RequiredArgsConstructor
public class AnimeController {
    
    private final AnimeService animeService;

    @GetMapping
    public String text(){
        return "menino maluquinho";
    }

    @GetMapping("/list")
    public Flux<Anime> listAll() {
        return animeService.findAll();
    }

}
