package com.braisedpanda.shirotest.service;

import com.braisedpanda.shirotest.model.po.ClassGrades;
import com.braisedpanda.shirotest.model.po.ClassGradesCard;
import com.braisedpanda.shirotest.model.po.StudentGrades;
import com.braisedpanda.shirotest.model.po.StudentGradesCard;
import com.braisedpanda.shirotest.model.vo.StudentGradesCustom;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GradesService {

    void add(StudentGradesCard card);


    List<StudentGradesCard> getGradesCard(String stuId);

    void insertGrades(StudentGrades studentGrades);


    StudentGrades getGrades(String stugradesCardId);


    List<StudentGradesCustom> getStuGradesBystuId(String stuId);
    //获取部分的学生成绩卡信息(只获取考试时间和考试描述)
    List<StudentGradesCard> getSGCard();
    //批量生成学生成绩卡
    void insertClassGradesCard(ClassGradesCard cgcrad);
    //获取所有的班级成绩卡片

    List<ClassGradesCard> listClassGradesCard();

    StudentGradesCard getGradesCardById_and_DesCribe(String stuId, String time_describe);

    void insertClassGrades(ClassGrades ClassGrades);
    //查找所有的班级成绩
    List<ClassGrades>  listClassGrades();
    //根据id查找班级成绩卡
    ClassGradesCard getClassGradesCardByID(String classGradesCardId);
}
