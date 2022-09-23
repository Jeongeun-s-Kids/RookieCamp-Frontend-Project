package com.example.demo.model.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.model.vo.ProductVO;

@Mapper
public interface ProductDAO {
    int insert(ProductVO vo);
    int update(ProductVO vo);
    int delete(ProductVO vo);
    ProductVO select(ProductVO vo);
    List<ProductVO> selectAll();
}
