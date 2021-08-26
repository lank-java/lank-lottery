package com.lank.lottery.interfaces;

import com.lank.lottery.common.Constants;
import com.lank.lottery.common.Result;
import com.lank.lottery.dao.ActivityMapper;
import com.lank.lottery.po.Activity;
import com.lank.lottery.rpc.IActivityBooth;
import com.lank.lottery.rpc.dto.ActivityDto;
import com.lank.lottery.rpc.req.ActivityReq;
import com.lank.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @author LanceLan
 * @since 2021-08-26 16:15
 */
@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private ActivityMapper activityMapper;

    @Override
    public ActivityRes queryActivityById(ActivityReq activityReq) {

        Activity activity = activityMapper.selectByPrimaryKey(activityReq.getActivityId());

        ActivityDto activityDto = ActivityDto.builder()
                .activityDesc(activity.getActivityDesc())
                .activityId(activity.getActivityId())
                .activityName(activity.getActivityName())
                .beginDateTime(activity.getBeginDateTime())
                .endDateTime(activity.getEndDateTime())
                .state(activity.getState())
                .stockCount(activity.getStockCount())
                .takeCount(activity.getTakeCount())
                .build();

        return ActivityRes.builder()
                .activityDto(activityDto)
                .result(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()))
                .build();
    }
}
