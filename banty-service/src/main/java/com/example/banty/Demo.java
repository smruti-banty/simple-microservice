package com.example.banty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/banty")
public class Demo {
    private WebClient.Builder webClient;

    public Demo(WebClient.Builder webClient) {
        this.webClient = webClient;
    }

    @GetMapping("/hyy")
    String hyy() {
        return "hyy from banty service";
    }

    @GetMapping("/hello")
    String hello() {
        String block = webClient.build().get().uri("http://smruti-service/smruti/hello")
                .retrieve().bodyToMono(String.class).block();
        return "From to banty: " + block;
    }

}
