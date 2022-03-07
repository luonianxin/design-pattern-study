package org.luonianxin.study.design;

import com.alibaba.fastjson.JSON;
import org.luonianxin.study.design.mq.AccountCreatedMq;

/**
 *   处理用户开户Mq消息的服务，在实际中可能要实现某个MQ接口
 */
public class AccountCreateMqService {

    /**
     *   处理MQ消息
     * @param message mq消息体
     */
    public void onMessage(String message) {
        AccountCreatedMq mq = JSON.parseObject(message,AccountCreatedMq.class);
        mq.getNumber(); // userId
        mq.getAddress(); // 地址
        mq.getAccountDate(); // 开户日期
        // ... 处理具体业务
    }
}
