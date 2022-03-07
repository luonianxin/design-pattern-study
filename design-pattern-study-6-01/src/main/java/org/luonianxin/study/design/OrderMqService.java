package org.luonianxin.study.design;

import com.alibaba.fastjson.JSON;
import org.luonianxin.study.design.mq.OrderMq;

/**
 *  订单处理服务
 */
public class OrderMqService {

    public void onMessage(String message){
        OrderMq mqMsg = JSON.parseObject(message,OrderMq.class);

        mqMsg.getOrderId();
        mqMsg.getCreateOrderTime();  // 订单创建时间
        mqMsg.getUid(); // userId
        // ...处理具体业务逻辑
    }
}
