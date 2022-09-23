package com.example.demo;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SatisfactionDAO {
    void insertSatisfaction(SatisfactionVO vo);
    void updateSatisfaction(SatisfactionVO vo);
    void deleteSatisfaction(SatisfactionVO vo);
    SatisfactionVO getSatisfaction(SatisfactionVO vo);
    List<SatisfactionVO> getSatisfactionList(SatisfactionVO vo);
}
