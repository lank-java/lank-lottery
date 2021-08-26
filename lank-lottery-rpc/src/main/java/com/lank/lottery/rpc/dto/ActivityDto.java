package com.lank.lottery.rpc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LanceLan
 * @since 2021-08-26 14:41
 */
@Data
@AllArgsConstructor
@Builder
public class ActivityDto implements Serializable {

    //
    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动描述
     */
    private String activityDesc;

    /**
     * 开始时间
     */
    private Date beginDateTime;

    /**
     * 结束时间
     */
    private Date endDateTime;

    /**
     * 库存
     */
    private Integer stockCount;

    /**
     * 每人可参与次数
     */
    private Integer takeCount;

    /**
     * 活动状态：编辑、提审、撤审、通过、运行、拒绝、关闭、开启
     */
    private Integer state;
}
