package com.example.demo.controller;

import com.example.demo.entity.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test")
public class TestController {
    @GetMapping("/TEST")
    public R test(){
       return R.ok("Java1234是啥");
    }
}
