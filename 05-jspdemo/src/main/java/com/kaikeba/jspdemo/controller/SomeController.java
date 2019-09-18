package com.kaikeba.jspdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//视图了   不用rest
@Controller
public class SomeController {

    @GetMapping("/some")
    public String someHandle(){

        return "page/welcome";
    }


}
