package com.example.demo.controllers;

import com.example.demo.services.ErDetFredag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @GetMapping("/fredag")
    @ResponseBody
    public String erDetFredag(){

        ErDetFredag x = new ErDetFredag();
        return "Er det fredag? \n" + x.freitag();
    }

}
