package com.hg.systemGd.issm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 工单状态
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Gd_status")
public class Gd_status implements Serializable {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    /**
     * 状态
     */
    @Column(name = "status")
    private String status;
    /**
     * 状态名
     */
    @Column(name = "statusName")
    private String statusName;

}
