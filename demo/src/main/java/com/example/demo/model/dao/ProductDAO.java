package com.example.demo.model.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.model.vo.ProductVO;
import com.example.demo.model.vo.SearchVO;

@Mapper
public interface ProductDAO {
    int insert(ProductVO vo);
    int update(ProductVO vo);
    int delete(ProductVO vo);
    ProductVO select(ProductVO vo);
    List<ProductVO> selectAll();
    List<ProductVO> selectOne(SearchVO vo);
    List<ProductVO> selectTwo(SearchVO vo);
    List<ProductVO> selectThree(SearchVO vo);
}
