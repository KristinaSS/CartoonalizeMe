package com.kristina.CartoonalizeMe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class RunPLS {
    @GetMapping("/hi")
    public String greeting() {
        return "greeting";
    }
}
