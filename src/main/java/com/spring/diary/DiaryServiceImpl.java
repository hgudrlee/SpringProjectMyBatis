package com.spring.diary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryServiceImpl implements DiaryService {
    @Autowired
    DiaryDAO diaryDAO;

    @Override
    public int insertDiary(DiaryVO vo) {
        return diaryDAO.insertDiary(vo);
    }

    @Override
    public int deleteDiary(int seq) {
        return diaryDAO.deleteDiary(seq);
    }

    @Override
    public int updateDiary(DiaryVO vo) {
        return diaryDAO.updateDiary(vo);
    }

    @Override
    public DiaryVO getDiary(int seq) {
        return diaryDAO.getDiary(seq);
    }

    @Override
    public List<DiaryVO> getDiaryList() {
        return diaryDAO.getDiaryList();
    }
}
