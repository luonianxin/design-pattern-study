package org.luonianxin.learn.design.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.luonianxin.study.design.MQAdapter;
import org.luonianxin.study.design.OrderAdapterService;
import org.luonianxin.study.design.RebateInfo;
import org.luonianxin.study.design.cuisine.impl.InsideOrderServiceImpl;
import org.luonianxin.study.design.cuisine.impl.POPOrderAdapterServiceImpl;
import org.luonianxin.study.design.mq.AccountCreatedMq;
import org.luonianxin.study.design.mq.OrderMq;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ApiTest {


    @Test
    public void test_MQAdapter() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException {

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = s.parse("2020-06-01 23:20:16");

        AccountCreatedMq create_account = new AccountCreatedMq();
        create_account.setNumber("100001");
        create_account.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        create_account.setAccountDate(parse);
        create_account.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<String, String>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(create_account.toString(), link01);
        System.out.println("mq.create_account(适配前)" + create_account.toString());
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));

        System.out.println("");

        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(parse);

        HashMap<String, String> link02 = new HashMap<String, String>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MQAdapter.filter(orderMq.toString(), link02);
        System.out.println("mq.orderMq(适配前)" + orderMq.toString());
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));
    }


    @Test
    public void test_interfAdapter(){
        OrderAdapterService insideOrderServiceImpl = new InsideOrderServiceImpl();
        System.out.println("判断首单(自营)："+insideOrderServiceImpl.isFirst("U100001"));
        OrderAdapterService popOrderService = new POPOrderAdapterServiceImpl();
        System.out.println("判断是否为首单(pop)："+popOrderService.isFirst("U20022100020"));
    }
}
