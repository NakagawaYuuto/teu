package com.animation.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class AnimationTitleController {

    @GetMapping("/title")
    public List<String> titlename(){
        return List.of("鉄腕アトム", "機動戦士ガンダム");
    }

    @PostMapping("/names")
    public ResponseEntity<String> createName(@RequestBody CreateForm form){
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/names/id")
                 .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");
    }

    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> updateName(@PathVariable("id")int id, @RequestBody UpdateForm from){
        return ResponseEntity.ok(Map.of ("message", "name successfully updated"));
    }
}
