package org.piper.springmvc.controller;

import org.piper.springmvc.service.ReadService;
import org.piper.springmvc.service.WriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private ReadService readService;

    @Autowired
    private WriteService writeService;

    @RequestMapping("")
    @ResponseBody
    public String index() {
        return "Hello Piper";
    }

    @RequestMapping("/operate")
    @ResponseBody
    public String operate() {
        readService.read();
        writeService.write();
        return "success";
    }
}
