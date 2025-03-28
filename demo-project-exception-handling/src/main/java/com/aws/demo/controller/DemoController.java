package com.aws.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/getWork")
    public void getDemo(@RequestParam(name = "id") String id1)
    {
        System.out.println("==========id is ::"+id1);
    }
    @GetMapping("/getWork1")
    public void getDemo1(@RequestParam(name = "id") String id1,@RequestParam(name = "id1") String ide)
    {
        System.out.println("==========id is ::"+id1);
    }

    //  http://localhost:8080/getWork?hello=hi iam getmapping
}
