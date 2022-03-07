package org.luonianxin.learn.design.pay.channel;

import org.luonianxin.learn.design.pay.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 *  抽象支付行为类，所有的具体支付方式都要继承该类型,模板方法模式
 */
public abstract class Pay {

    protected final Logger logger = LoggerFactory.getLogger(Pay.class);
    /**
     *  支付方式 (1.密码支付，2.指纹支付，3，刷脸支付)
     */
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    /**
     *  具体的支付方法
     * @param uId 用户id
     * @param tradeId 交易id
     * @param amount 交易金额
     * @return 交易结果
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
