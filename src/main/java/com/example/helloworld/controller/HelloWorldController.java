package com.example.helloworld.controller;

import com.example.helloworld.dto.XmlDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/hello")
    public String sendGreetings() {
        return "Hello, World!";
    }

    @PostMapping(value = "/test-xml",
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE)
    public XmlDto logXmlDto(@RequestBody XmlDto xmlDto) {
        log.info("Received XML DTO: {}", xmlDto);
        return xmlDto;
    }
}
