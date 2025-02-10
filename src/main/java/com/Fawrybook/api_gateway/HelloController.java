package com.Fawrybook.api_gateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String welcome(){
        return "Welcome to Fawrybook Api from from gateway";
    }
    
}
