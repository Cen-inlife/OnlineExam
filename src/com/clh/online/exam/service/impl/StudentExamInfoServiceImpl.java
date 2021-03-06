package com.clh.online.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clh.online.exam.dao.StudentExamInfoMapper;
import com.clh.online.exam.po.StudentExamInfo;
import com.clh.online.exam.service.StudentExamInfoService;


@Service
public class StudentExamInfoServiceImpl implements StudentExamInfoService {

	@Autowired
	private StudentExamInfoMapper studentExamInfoMapper;
	
	public List<StudentExamInfo> getStudentExamCountByClassId(int classId) {
		return studentExamInfoMapper.getStudentExamCountByClassId(classId);
	}

	public List<StudentExamInfo> getStudentExamInfo(int studentId) {
		return studentExamInfoMapper.getStudentExamInfo(studentId);
	}

	public List<StudentExamInfo> getAllStudentAvgScoreCount(int classId) {
		return studentExamInfoMapper.getAllStudentAvgScoreCount(classId);
	}

}
