package com.hg.systemGd.issm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 知识库
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Kownledge")
public class Kownledge {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Long id;

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
     * 解决方案
     */
    @Column(name="solution")
    private String solution;

    /**
     * 问题分析
     */
    @Column(name="parse")
    private String parse;
}
