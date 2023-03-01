package com.sample.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //using get method and hello-world as URI
    @RequestMapping(method= RequestMethod.GET, path="/hello-world")
//using get method and hello-world URI
    @GetMapping(path="/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("Hello World"); //constructor of HelloWorldBean
    }
}
