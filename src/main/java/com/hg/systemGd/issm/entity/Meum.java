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
@Table(name="sys_menu")
public class Meum implements Serializable {
    /*
    * 模块主键*/
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long id;

    /**
     * 模块名称
     */
    @Column(name="name")
    private String name;


    /**
     * 模块图标在项目中的地址
     */
    @Column(name="icon")
    private String icon;

    /**
     * 跳转的页面
     */
    @Column(name="redirectPath")
    private String redirectPath;

}
