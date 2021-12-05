package com.clh.online.exam.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clh.online.exam.po.ExamSubjectMiddleInfo;


@Repository
public interface ExamSubjectMiddleInfoMapper {

	public List<ExamSubjectMiddleInfo> getExamPaperWithSubject(ExamSubjectMiddleInfo esm);
	
	public int isAddESM(Map<String, Object> map);
	
	public int removeSubjectWithExamPaper(Map<String, Object> map);
	
	public Integer getEsmByExamIdWithSubjectId(ExamSubjectMiddleInfo esm);
}
