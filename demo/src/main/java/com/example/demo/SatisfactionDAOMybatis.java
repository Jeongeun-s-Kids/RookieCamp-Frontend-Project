package com.example.demo;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class SatisfactionDAOMybatis implements SatisfactionDAO{
    @Autowired
    private SqlSessionTemplate mybatis;

    public void insertSatisfaction(SatisfactionVO vo){
        mybatis.insert("insertSatisfaction", vo);
    }
    public void updateSatisfaction(SatisfactionVO vo){
        mybatis.update("updateProduct", vo);
    }
    public void deleteSatisfaction(SatisfactionVO vo){
        mybatis.delete("deleteProduct", vo);
    }
    public SatisfactionVO getSatisfaction(SatisfactionVO vo){
        return (SatisfactionVO) mybatis.selectOne("getSatisfaction", vo);
    }
    public List<SatisfactionVO> getSatisfactionList(SatisfactionVO vo){
        return (List<SatisfactionVO>)(Object) mybatis.selectList("getSatisfactionList", vo);
    }
}
