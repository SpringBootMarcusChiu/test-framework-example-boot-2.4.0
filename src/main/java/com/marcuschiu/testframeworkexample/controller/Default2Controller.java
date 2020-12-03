package com.marcuschiu.testframeworkexample.controller;

import com.marcuschiu.testframeworkexample.service.Default1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Default2Controller {

    @Autowired
    Default1Service default1Service;

    @RequestMapping("/default/2")
    public @ResponseBody
    String greeting() {
        return default1Service.greet();
    }
}
