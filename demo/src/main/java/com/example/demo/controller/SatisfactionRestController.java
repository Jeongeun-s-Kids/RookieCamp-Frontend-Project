package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.service.SatisfactionService;
import com.example.demo.model.vo.SatisfactionVO;

@RestController
@RequestMapping("/satisfaction")
public class SatisfactionRestController {
    @Autowired
    SatisfactionService sService;
  
    @GetMapping()
    public List<SatisfactionVO> getSatisfactionList() {
          return sService.getSatisfactionList();
    }
    
    @PostMapping()
    public int addSatisfaction(@RequestBody SatisfactionVO vo){
        return sService.insertSatisfaction(vo);
    }
}
