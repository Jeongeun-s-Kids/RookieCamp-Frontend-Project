package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.model.dao.ProductDAO;
import com.example.demo.model.vo.ProductVO;
import com.example.demo.model.vo.SearchVO;
import com.example.demo.model.vo.SearchVO2;
import com.example.demo.model.vo.SearchVO3;

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

    @Override
    public List<ProductVO> getProductOne(SearchVO vo) {
        return pDao.selectOne(vo);
    }

    @Override
    public List<ProductVO> getProductTwo(SearchVO2 vo) {
        return pDao.selectTwo(vo);
    }

    @Override
    public List<ProductVO> getProductThree(SearchVO3 vo) {
        return pDao.selectThree(vo);
    }
}
