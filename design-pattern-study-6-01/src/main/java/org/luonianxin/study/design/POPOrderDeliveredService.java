package org.luonianxin.study.design;

import com.alibaba.fastjson.JSON;
import org.luonianxin.study.design.mq.POPOrderDeliveredMq;

/**
 *   外部订单处理服务
 */
public class POPOrderDeliveredService {

    /**
     *  模拟接收到mq消息后处理逻辑
     * @param message mq消息体
     */
    public void onMessage(String message) {

        POPOrderDeliveredMq mq = JSON.parseObject(message,POPOrderDeliveredMq.class);
        mq.getOrderId();    // 订单id，业务id
        mq.getOrderTime();  // 订单时间
        mq.getuId();  // userId

        // ... 处理具体业务逻辑
    }
}
