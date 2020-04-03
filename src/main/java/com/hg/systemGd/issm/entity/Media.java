package com.hg.systemGd.issm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 工单关联附件
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sys_media")
public class Media {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    /**
     * 文件类型
     */
    @Column(name="type")
    private String type;


    /**
     * 文件数据流
     */
    @Column(name="data")
    private String data;

    /**
     * 关联工单
     */
    @Column(name="gd_id")
    private String gd_id;
}
