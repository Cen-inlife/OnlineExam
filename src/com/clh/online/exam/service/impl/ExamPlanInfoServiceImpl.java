package com.clh.online.exam.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clh.online.exam.dao.ExamPlanInfoMapper;
import com.clh.online.exam.po.ExamPlanInfo;
import com.clh.online.exam.service.ExamPlanInfoService;


@Service
public class ExamPlanInfoServiceImpl implements ExamPlanInfoService {

	@Autowired
	private ExamPlanInfoMapper examPlanInfoMapper;
	
	public List<ExamPlanInfo> getExamPlans(Map<String, Object> map) {
		return examPlanInfoMapper.getExamPlans(map);
	}

	public int isAddExamPlan(ExamPlanInfo examPlan) {
		return examPlanInfoMapper.isAddExamPlan(examPlan);
	}

	public int isUpdateExamPlan(ExamPlanInfo examPlan) {
		return examPlanInfoMapper.isUpdateExamPlan(examPlan);
	}

	public ExamPlanInfo getExamPlanById(int examPlanId) {
		return examPlanInfoMapper.getExamPlanById(examPlanId);
	}

	//查询学生待考信息
	public List<ExamPlanInfo> getStudentWillExam(Map<String, Object> map) {
		return examPlanInfoMapper.getStudentWillExam(map);
	}

	//移除过期考试安排
	public int isRemoveExamPlan(int examPlanId) {
		return examPlanInfoMapper.isRemoveExamPlan(examPlanId);
	}

}
