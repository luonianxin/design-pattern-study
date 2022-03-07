package org.luonianxin.learn.design.test;

import org.junit.Test;
import org.luonianxin.learn.design.pay.channel.Pay;
import org.luonianxin.learn.design.pay.channel.WxPay;
import org.luonianxin.learn.design.pay.channel.ZfbPay;
import org.luonianxin.learn.design.pay.mode.PayFaceMode;
import org.luonianxin.learn.design.pay.mode.PayFingerprintMode;

import java.math.BigDecimal;

public class ApiTest {

    /**
     *  TODO 关于调用部分可以使用抽象工厂或策略模式配合map结构，将服务配置化。因为这里主要展示桥接模式，所以就不在额外多加代码，避免喧宾夺主。
     */
    @Test
    public void test_Channel_Mode(){

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));
    }
}
