package com.lank.lottery.rpc;

import com.lank.lottery.rpc.req.ActivityReq;
import com.lank.lottery.rpc.res.ActivityRes;

/**
 * @author LanceLan
 * @since 2021-08-26 11:29
 * 活动展台接口
 */
public interface IActivityBooth {

    /**
     * 查询活动展台接口
     * @param activityReq activityReq
     * @return ActivityRes
     */
    ActivityRes queryActivityById(ActivityReq activityReq);
}
