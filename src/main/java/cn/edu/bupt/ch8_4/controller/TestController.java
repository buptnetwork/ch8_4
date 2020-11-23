package cn.edu.bupt.ch8_4.controller;

import cn.edu.bupt.ch8_4.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/save")
    public String save(){
        testService.save();
        System.out.println("testController Save");
        return "save done";

    }
}
