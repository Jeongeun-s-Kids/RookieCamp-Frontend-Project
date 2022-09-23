package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.service.ProductService;
import com.example.demo.model.vo.ProductVO;

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
}
