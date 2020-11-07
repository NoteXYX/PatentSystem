package com.hfut.patentSystem.Dao.Entity;

import lombok.Data;

@Data
public class Patent {
    //主键id
    private Long id;

    //专利申请号
    private String appNum;

    //专利标题
    private String title;

    //专利摘要
    private String patentAbstract;

    //专利申请公司
    private String companyName;

    //专利内容
    private String content;

    //技术领域
    private String techField;

    //技术背景
    private String techBg;

}