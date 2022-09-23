package com.example.demo.model.service;

import java.util.List;

import com.example.demo.model.vo.SatisfactionVO;

public interface SatisfactionService {
    
    int insertSatisfaction(SatisfactionVO vo);
    
    int updateSatisfaction(SatisfactionVO vo);
    
    int deleteSatisfaction(SatisfactionVO vo);

    SatisfactionVO getSatisfaction(SatisfactionVO vo);

    List<SatisfactionVO> getSatisfactionList();
    

}
