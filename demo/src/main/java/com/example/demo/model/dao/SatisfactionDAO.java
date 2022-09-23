package com.example.demo.model.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.vo.SatisfactionVO;

@Mapper
public interface SatisfactionDAO {
    int insert(SatisfactionVO vo);
    int update(SatisfactionVO vo);
    int delete(SatisfactionVO vo);
    SatisfactionVO select(SatisfactionVO vo);
    List<SatisfactionVO> selectAll();
}
