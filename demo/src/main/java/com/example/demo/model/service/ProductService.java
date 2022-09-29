package com.example.demo.model.service;

import java.util.List;

import com.example.demo.model.vo.ProductVO;
import com.example.demo.model.vo.SearchVO;
import com.example.demo.model.vo.SearchVO2;
import com.example.demo.model.vo.SearchVO3;

public interface ProductService {

    int insertProduct(ProductVO vo);
    
    int updateProduct(ProductVO vo);
    
    int deleteProduct(ProductVO vo);

    List<ProductVO> getProductList();
    
    ProductVO getProduct(ProductVO vo);

    List<ProductVO> getProductOne(SearchVO vo);
    List<ProductVO> getProductTwo(SearchVO2 vo);
    List<ProductVO> getProductThree(SearchVO3 vo);
}
