package cn.edu.swpu.cins.weike.service;

import cn.edu.swpu.cins.weike.entity.persistence.ProjectInfo;
import cn.edu.swpu.cins.weike.entity.persistence.StudentDetail;
import cn.edu.swpu.cins.weike.entity.view.PersonData;
import cn.edu.swpu.cins.weike.entity.view.ProjectRecommend;
import cn.edu.swpu.cins.weike.exception.StudentException;

import java.util.List;

/**
 * Created by muyi on 17-4-6.
 */
public interface StudentService {


    //学生发布项目
    // 判断学生是否填写了个人信息  否则不能发布项目
    int issueProject(ProjectInfo projectInfo) throws StudentException;

    //学生添加个人信息
    int addPersonal(StudentDetail studentDetail) throws StudentException;

    //推荐格式的学生参加项目
    List<ProjectRecommend> queryForReCommod(List<String> skills,String username) throws StudentException;

    //修改学生信息
    int updateInfo(StudentDetail studentDetail, String username) throws StudentException;
    //查询发布过的所有项目
    List<String> queryAllProject(String projectConnector) throws StudentException;

    PersonData queryForData(String username) throws StudentException;


}
