package com.animation.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimationController {

    @GetMapping("/anime")
    public String anime (){return "anime";}


}
