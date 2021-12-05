package com.clh.online.exam.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clh.online.exam.po.ExamPaperInfo;


@Repository
public interface ExamPaperInfoMapper {

	public List<ExamPaperInfo> getExamPapers(Map<String, Object> map);
	
	public ExamPaperInfo getExamPaperById(int examPaperId);

	public List<ExamPaperInfo> getExamPapersClear();
	
	public int isAddExamPaper(ExamPaperInfo examPaper);
	
	public int isUpdateExamPaper(ExamPaperInfo examPaper);
	
	public int isDelExamPaper(int examPaperId);
	
	public int getExamPpaerTotal();
	
	public int isUpdateExamPaperSubjects(Map<String, Object> map);
	
	public int isUpdateExamPaperScore(Map<String, Object> map);
}
