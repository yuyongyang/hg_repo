package com.hg.systemGd.issm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 系统公告
 *
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sys_News")
public class Sys_News {

    /**
     * 公告id
     *
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    /**
     * 发布时间
     */
    @Column
    private String publicTime;

    /**
     *公告标题
     */
    @Column
    private String title;

    /**
     *公告背景图片
     */
    @Column
    private String picPath;


    /**
     *公告内容
     */
    @Column
    private String content;

}

