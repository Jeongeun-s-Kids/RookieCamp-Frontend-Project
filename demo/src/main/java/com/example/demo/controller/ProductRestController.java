package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.service.ProductService;
import com.example.demo.model.vo.ProductVO;
import com.example.demo.model.vo.SearchVO;
import com.example.demo.model.vo.SearchVO2;
import com.example.demo.model.vo.SearchVO3;

@RestController
@RequestMapping("/product")
@CrossOrigin(allowCredentials = "true", originPatterns = { "*" })
public class ProductRestController {

  @Autowired
  ProductService pService;

  @GetMapping("/productAll")
  public List<ProductVO> getProductAll() {
		return pService.getProductList();
	}    

  @PostMapping("/productOne")
  public List<ProductVO> getProductOne(@RequestBody SearchVO vo){
    return pService.getProductOne(vo);
  }

  @PostMapping("/productTwo")
  public List<ProductVO> getProductTwo(@RequestBody SearchVO2 vo){
    return pService.getProductTwo(vo);
  }

  @PostMapping("/productThree")
  public List<ProductVO> getProductThree(@RequestBody SearchVO3 vo){
    return pService.getProductThree(vo);
  }
}
