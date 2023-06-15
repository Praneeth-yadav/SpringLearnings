package com.ep.spring.boot.web.springbootweb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	


    @RequestMapping(value="/hello")
    @ResponseBody
    public String hello(@RequestParam String name){
    	

        return "hello"+name;
    }


}
