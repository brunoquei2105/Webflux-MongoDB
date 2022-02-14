package com.project.weblux.service;

import com.project.weblux.document.Playlist;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {

    public Flux<Playlist> findAll();

    public Mono<Playlist> findById(String id);

    public Mono<Playlist> save(Playlist playlist);
}
