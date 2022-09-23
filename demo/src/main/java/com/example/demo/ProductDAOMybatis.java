package com.example.demo;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class ProductDAOMybatis implements ProductDAO{
    @Autowired
    private SqlSessionTemplate mybatis;

    public void insertProduct(ProductVO vo){
        mybatis.insert("insertProduct", vo);
    }
    public void updateProduct(ProductVO vo){
        mybatis.update("updateProduct", vo);
    }
    public void deleteProduct(ProductVO vo){
        mybatis.delete("deleteProduct", vo);
    }
    public ProductVO getProduct(ProductVO vo){
        return (ProductVO) mybatis.selectOne("getProduct", vo);
    }
    public List<ProductVO> getProductList(ProductVO vo){
        return (List<ProductVO>)(Object) mybatis.selectList("getProductList", vo);
    }
}
