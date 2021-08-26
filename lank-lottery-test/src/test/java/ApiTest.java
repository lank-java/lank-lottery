import com.alibaba.fastjson.JSON;
import com.lank.lottery.rpc.IActivityBooth;
import com.lank.lottery.rpc.req.ActivityReq;
import com.lank.lottery.rpc.res.ActivityRes;
import com.lank.lottery.test.LotteryTestApplication;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author LanceLan
 * @since 2021-08-26 16:42
 */
@Slf4j
@SpringBootTest(classes = LotteryTestApplication.class)
@RunWith(SpringRunner.class)
public class ApiTest {

    @Reference(interfaceClass = IActivityBooth.class)
    private IActivityBooth activityBooth;

    @Test
    public void testRpc(){
        ActivityReq activityReq = new ActivityReq();
        activityReq.setActivityId(1000L);

        ActivityRes activityRes = activityBooth.queryActivityById(activityReq);
        log.info("测试结果:{}", JSON.toJSONString(activityRes));
    }

}
