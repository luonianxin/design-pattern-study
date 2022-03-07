package org.luonianxin.learn.design.pay.channel;

import org.luonianxin.learn.design.pay.mode.IPayMode;

import java.math.BigDecimal;

public class ZfbPay extends Pay{

    public ZfbPay(IPayMode payMode){
        super(payMode);
    }
    /**
     * 具体的支付方法
     *
     * @param uId     用户id
     * @param tradeId 交易id
     * @param amount  交易金额
     * @return 交易结果
     */
    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {

        logger.info("模拟支付宝渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        logger.info("模拟支付宝渠道风控校验。uId：{} tradeId：{} security：{}",uId,tradeId,security);
        if (!security) {
            logger.info("模拟支付宝渠道支付划账拦截。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            return "0001";
        }
        logger.info("模拟支付宝渠道支付划账成功。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
        return "0000";
    }
}
