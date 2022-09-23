package com.example.demo.model.service;

import java.util.List;

import com.example.demo.model.vo.ProductVO;

public interface ProductService {

    int insertProduct(ProductVO vo);
    
    int updateProduct(ProductVO vo);
    
    int deleteProduct(ProductVO vo);

    List<ProductVO> getProductList();
    
    ProductVO getProduct(ProductVO vo);
}
