package com.example.demo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductDAO {
    void insertProduct(ProductVO vo);
    void updateProduct(ProductVO vo);
    void deleteProduct(ProductVO vo);
    ProductVO getProduct(ProductVO vo);
    List<ProductVO> getProductList(ProductVO vo);
}
