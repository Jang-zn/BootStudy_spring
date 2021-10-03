package com.study.bootstudy.controller;


import com.study.bootstudy.service.SortService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final SortService ss;

    public MainController(SortService ss) {
        this.ss = ss;
    }

    @GetMapping("/")
    public String hello(@RequestParam List<String> list){
        return ss.doSort(list).toString();
    }

}
