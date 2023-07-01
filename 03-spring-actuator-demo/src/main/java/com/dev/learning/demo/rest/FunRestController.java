package com.dev.learning.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHelloWorld(){
        return "Hello World!!!!!!!!!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run 5k daily ";
    }

    @GetMapping("/fortune")
    public String getDailyFortuneForYou(){
        return "Today is your lucky day ";
    }
}
