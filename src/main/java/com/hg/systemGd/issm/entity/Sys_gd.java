package com.hg.systemGd.issm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sys_gd")
public class Sys_gd implements Serializable {

    /**
     * 工单主键
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    /**
     * 问题标题
     */
    @Column(name="title")
    private String title;
    /**
     * 问题类型
     */
    @Column(name="type")
    private String type;
    /**
     * 问题描述
     */
    @Column(name="des")
    private String des;
    /**
     * 客户名称
     */
    @Column(name="cusName")
    private String cusName;
    /**
     * 创建时间
     */
    @Column(name="createTime")
    private String createTime;

    /**
     * 处理时间
     */
    @Column(name="dealTime")
    private String dealTime;


    /**
     * 创建人
     */
    @Column(name="creatPerson")
    private String creatPerson;

    /**
     * 紧急程度
     */
    @Column(name="level")
    private String level;
    /**
     * 工单状态
     */
    @Column(name="status")
    private String status;

    /**
     * 处理人
     */
    @Column(name="dealPerson")
    private String dealPerson;

    /**
     * 问题分析
     */
    @Column(name="parse")
    private String parse;

    /**
     * 解决方案
     */
    @Column(name="solution")
    private String solution;

    /**
     * 客户评分
     */
    @Column(name="score")
    private String score;

    /**
     * 解决结果
     */
    @Column(name="result")
    private String result;


    /**
     * 是都是新增
     * 点击过就false，
     * 操作过就是true
     */
    @Column(name="isNew")
    private String isNew;




}
