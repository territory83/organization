package com.organization.organization.controller;

import com.organization.organization.controller.utils.Result;
import com.organization.organization.domain.Queans;
import com.organization.organization.service.IQueansService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/queans")
public class QueansController {

    @Autowired
    private  IQueansService queansService;

    @GetMapping
    public Result getAll(){
        return new Result(true, 200, "message", queansService.list());
    }

//    @PostMapping
//    public Result save(@RequestBody Queans queans){
//        return new Result(queansService.save(queans));
//    }


}
