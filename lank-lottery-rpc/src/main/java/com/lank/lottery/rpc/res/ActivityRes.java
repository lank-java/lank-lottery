package com.lank.lottery.rpc.res;

import com.lank.lottery.common.Result;
import com.lank.lottery.rpc.dto.ActivityDto;
import lombok.Builder;
import lombok.Data;

/**
 * @author LanceLan
 * @since 2021-08-26 16:11
 */
@Data
@Builder
public class ActivityRes {

    private Result result;

    private ActivityDto activityDto;
}
