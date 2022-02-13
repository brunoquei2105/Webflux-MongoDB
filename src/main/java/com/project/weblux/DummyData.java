package com.project.weblux;

import com.project.weblux.document.Playlist;
import com.project.weblux.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;
//
//@Component
//public class DummyData implements CommandLineRunner {
//
//    @Autowired
//    private PlaylistRepository playlistRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        playlistRepository.deleteAll()
//                .thenMany(Flux.just("Duran Duran", "Information Society", "U2", "Metalica", "Guns of Roses", "Eddie Vedder",
//                                "Billy Idol", "Depeche Mode", "RHCP")
//                        .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
//                        .flatMap(playlistRepository::save))
//                .subscribe(System.out::println);
//
//    }
//}
