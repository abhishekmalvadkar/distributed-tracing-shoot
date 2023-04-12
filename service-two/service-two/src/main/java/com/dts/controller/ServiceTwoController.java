package com.dts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/service-two")
@RequiredArgsConstructor
@Slf4j
public class ServiceTwoController {


    @GetMapping("shoot")
    public String shootServiceTwo() {
        log.info("<<<<<<<< shootServiceTwo()");
        log.info("PROCESSING SOMETHING....");
        log.info("shootServiceTwo() >>>>>>>>>>");
        return "Hello from service 2";
    }

}
