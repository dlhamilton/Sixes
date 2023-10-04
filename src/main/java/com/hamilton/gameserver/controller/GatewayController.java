package com.hamilton.gameserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/myservice")
public class GatewayController {

    private static final Logger logger = LoggerFactory.getLogger(GatewayController.class);

    @GetMapping("/**")
    public ResponseEntity<String> forwardGetRequest(
        @RequestParam(name = "param1", required = false) String param1,
        @RequestParam(name = "param2", required = false) String param2){

        //@RequestBody(required = false) PersonDTO person) {

        logger.info("param1: {}", param1);
        logger.info("param2: {}", param2);

//            // person contains the deserialized JSON object
//            if (person != null) {
//                System.out.println("Name: " + person.getName());
//                System.out.println("Age: " + person.getAge());
//            } else {
//                System.out.println("Body was null or not provided.");
//            }

            return ResponseEntity.ok("Yeah buddy with: " + param1 + " and " + param2);
    }
}

