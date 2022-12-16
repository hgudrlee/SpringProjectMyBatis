package com.spring.diary;

import java.util.List;

public interface DiaryService {
    public int insertDiary(DiaryVO vo);
    public int deleteDiary(int seq);
    public int updateDiary(DiaryVO vo);
    public DiaryVO getDiary(int seq);
    public List<DiaryVO> getDiaryList();
}
