package com.hg.systemGd.issm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 工单用户表
* */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sys_user")
public class User implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    /**
     * 用户名
     */
    @Column(name = "name",)
    private  String name;
    /**
     * 密码
     */
    @Column(name="password")
    private String password;

    /**
     * 头像
     */
    @Column(name="icon")
    private String icon;

    /**
     * 邮箱
     */
    @Column(name="email")
    private String email;

    /**
    * 获得得分
    * */
    @Column(name="scroe")
    private String scroe;

    /**
     * 角色
     * 1.普通
     * 2.分派人员
     * 3。审核入库人员
     * */
    @Column(name="role")
    private Integer role;


    /**
     * 微信号
     * */
    @Column(name="wx")
    private String wx;


    /**
     * 部门
     * */
    @Column(name="dept")
    private String dept;

    /**
     * 职务
     * */
    @Column(name="duties")
    private String duties;

    /**
     * 办公电话
     */
    @Column(name="tel")
    private  String tel;

    /**
     * 办公电话(座机)
     */
    @Column(name="phoneNum")
    private String phoneNum;

    /**
     * model
     */
    @Transient
    private List<Meum> models=new ArrayList<>();

}
