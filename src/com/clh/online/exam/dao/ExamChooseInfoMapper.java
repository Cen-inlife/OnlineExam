package com.clh.online.exam.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clh.online.exam.po.ExamChooseInfo;


@Repository
public interface ExamChooseInfoMapper {

	public ExamChooseInfo getChooseWithIds(Map<String, Object> map);
	
	public int updateChooseWithIds(ExamChooseInfo examChoose);
	
	public int addChoose(Map<String, Object> map);
	
	public List<ExamChooseInfo> getChooseInfoWithSumScore(Map<String, Object> map);
	
	public List<ExamChooseInfo> getChooseInfoWithExamSubject(Map<String, Object> map);
}
