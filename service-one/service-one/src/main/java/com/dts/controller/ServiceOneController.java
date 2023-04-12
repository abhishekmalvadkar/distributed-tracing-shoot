package com.dts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/service-one")
@RequiredArgsConstructor
@Slf4j
public class ServiceOneController {

    private final RestTemplate restTemplate;

    @GetMapping("shoot")
    public String shootServiceOne() {
        log.info("<<<<<<<< shootServiceOne()");
        log.info("PROCESSING SOMETHING....");
        String response = this.restTemplate.getForObject("http://localhost:9091/api/service-two/shoot", String.class);
        log.info("shootServiceOne() >>>>>>>>>>");
        return response;
    }

}
