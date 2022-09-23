package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.model.dao.SatisfactionDAO;
import com.example.demo.model.vo.SatisfactionVO;

@Repository
@Component
public class SatisfactionServiceImpl implements SatisfactionService{

    @Autowired
    private SatisfactionDAO sDao;

    @Override
    public int insertSatisfaction(SatisfactionVO vo) {
        return sDao.insert(vo);
    }

    @Override
    public int updateSatisfaction(SatisfactionVO vo) {
        return sDao.update(vo);
    }

    @Override
    public int deleteSatisfaction(SatisfactionVO vo) {
        return sDao.delete(vo);
    }

    @Override
    public SatisfactionVO getSatisfaction(SatisfactionVO vo) {
        return sDao.select(vo);
    }

    @Override
    public List<SatisfactionVO> getSatisfactionList() {
        return sDao.selectAll();
    }

}
