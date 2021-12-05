package com.clh.online.exam.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clh.online.exam.dao.ExamHistoryPaperMapper;
import com.clh.online.exam.po.ExamHistoryInfo;
import com.clh.online.exam.po.ExamHistoryPaper;
import com.clh.online.exam.service.ExamHistoryPaperService;


@Service
public class ExamHistoryPaperServiceImpl implements ExamHistoryPaperService {

	@Autowired
	private ExamHistoryPaperMapper examHistoryPaperMapper;
	
	public List<ExamHistoryPaper> getExamHistoryToStudent(int studentId) {
		return examHistoryPaperMapper.getExamHistoryToStudent(studentId);
	}

	public int isAddExamHistory(Map<String, Object> map) {
		return examHistoryPaperMapper.isAddExamHistory(map);
	}

	public int getHistoryInfoWithIds(Map<String, Object> map) {
		return examHistoryPaperMapper.getHistoryInfoWithIds(map);
	}

	public List<ExamHistoryInfo> getExamHistoryToTeacher() {
		return examHistoryPaperMapper.getExamHistoryToTeacher();
	}

}
