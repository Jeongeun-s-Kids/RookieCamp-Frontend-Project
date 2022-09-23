package com.example.demo.model.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.model.dao.ProductDAO;
import com.example.demo.model.vo.ProductVO;

@Repository
@Component
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDAO pDao;

    @Override
    public int insertProduct(ProductVO vo) {
        return pDao.insert(vo);
    }

    @Override
    public int updateProduct(ProductVO vo) {
        return pDao.update(vo);
    }

    @Override
    public int deleteProduct(ProductVO vo) {
        return pDao.delete(vo);
    }

    @Override
    public ProductVO getProduct(ProductVO vo) {
        return pDao.select(vo);
    }

    @Override
    public List<ProductVO> getProductList() {
        return pDao.selectAll();
    }
}
