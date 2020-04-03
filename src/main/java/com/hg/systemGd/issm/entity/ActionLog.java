package com.hg.systemGd.issm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 用户操作日志
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="actionLog")
public class ActionLog {
    /**
     * 操作记录主键
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    /**
     * 工单id
     */
    @Column(name="gd_id")
    private Long gd_id;

    /**
     * 操作代码
     */
    @Column
    private String actionCode;

}
