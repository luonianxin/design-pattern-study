package org.itstack.demo.design;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author luonianxin
 * @Description 模式发奖服务
 * @Date 2021/8/20
 */
public class AwardController {

    private Logger logger = LoggerFactory.getLogger(AwardController.class);

    /**
     *  发奖品接口，此处使用一陀陀代码实现
     * @param awardReq
     * @return
     */
    public AwardRes awartToUser(AwardReq awardReq) {
        String reqStr = JSON.toJSONString(awardReq);
        AwardRes awardRes = null;

        return null;
    }
}

