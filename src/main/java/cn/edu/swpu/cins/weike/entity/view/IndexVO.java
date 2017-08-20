package cn.edu.swpu.cins.weike.entity.view;

import lombok.Data;

import java.util.List;

@Data
public class IndexVO {

    //项目详细信息
    private ProjectDetail projectDetails;
    //发布人详细信息
    private PersonData personData;
    //参加项目的情况
    private List<String> applySuccessPerson;
    //项目关注人
    private List<String> followPros;

    private int followNum;

    private int applySuccessNum;

    public IndexVO(ProjectDetail projectDetails, PersonData personData, List<String> applySuccessPerson, List<String> followPros, int followNum, int applySuccessNum) {
        this.projectDetails = projectDetails;
        this.personData = personData;
        this.applySuccessPerson = applySuccessPerson;
        this.followPros = followPros;
        this.followNum = followNum;
        this.applySuccessNum = applySuccessNum;
    }

    public IndexVO() {
    }

    public IndexVO(ProjectDetail projectDetails) {
        this.projectDetails = projectDetails;
    }
}