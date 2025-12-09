package com.pluralsight.northwindtradersapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // This method will respond to: http://localhost:8080
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home() {
        return "Hello World";
    }
}