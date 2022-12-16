package com.spring.diary;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DiaryDAO {
	@Autowired
	SqlSession sqlSession;

	public int insertDiary(DiaryVO vo) {
		int result = sqlSession.insert("Diary.insertDiary", vo);
		return result;
	}

	public int deleteDiary(int id) {
		int result = sqlSession.delete("Diary.deleteDiary", id);
		return result;
	}
	public int updateDiary(DiaryVO vo) {
		int result = sqlSession.update("Diary.updateDiary", vo);
		return result;
	}

	public DiaryVO getDiary(int seq) {
		DiaryVO one = sqlSession.selectOne("Diary.getDiary", seq);
		return one;
	}
	
	public List<DiaryVO> getDiaryList(){
		List<DiaryVO> list = sqlSession.selectList("Diary.getDiaryList");
		return list;
	}
}
