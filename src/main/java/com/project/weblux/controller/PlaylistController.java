package com.project.weblux.controller;

import com.project.weblux.document.Playlist;
import com.project.weblux.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.lang.management.MonitorInfo;

@RestController
@RequestMapping(path = "/api/v1/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @GetMapping
    public ResponseEntity<Flux<Playlist>>getAllPlaylist(){
        var playlist = playlistService.findAll();
        return new ResponseEntity<>(playlist, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Mono<Playlist>> getPlaylistById(@PathVariable String id){
        var playlist = playlistService.findById(id);
        return new ResponseEntity<>(playlist, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Mono<Playlist>> postPlaylist(@Valid @RequestBody Playlist playlist){
        var savedPlaylist = playlistService.save(playlist);
        return new ResponseEntity<>(savedPlaylist, HttpStatus.CREATED);
    }
}
