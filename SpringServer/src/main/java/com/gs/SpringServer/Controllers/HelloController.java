package com.gs.SpringServer.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class HelloController {

    @GetMapping
    public String returnHello(){
        return ("Hello ! Testing Actuator");
    }

    @GetMapping(path = "v1")
    public String returnMessage(){
        return ("All this endpoints, created for actuator");

    }
}