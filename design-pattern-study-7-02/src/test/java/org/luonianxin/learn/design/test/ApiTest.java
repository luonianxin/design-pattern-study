package org.luonianxin.learn.design.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.luonianxin.learn.design.pay.channel.Pay;
import org.luonianxin.learn.design.pay.channel.WxPay;
import org.luonianxin.learn.design.pay.channel.ZfbPay;
import org.luonianxin.learn.design.pay.dto.InsureItemDTO;
import org.luonianxin.learn.design.pay.factory.Map2DTOAdapter;
import org.luonianxin.learn.design.pay.mode.PayFaceMode;
import org.luonianxin.learn.design.pay.mode.PayFingerprintMode;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ApiTest {

    private static Map<String,String> link = new HashMap(20);

    static {
        link.put("itemCode","med_list_codg");
        link.put("itemSpec","drug_spec");
        link.put("itemName","drug_prodname");
        link.put("itemDosage","dosform");
        link.put("itemUnitCode","min_useunt");
        link.put("prod","manufacturer_name");
        link.put("directory","null");
        link.put("pym","pinyin");
        link.put("wbm","wubi");
        link.put("isValid","vali_flag");
        link.put("compoundLogo","compound_logo");
        link.put("ver","ver");
        link.put("verName","ver_name");
    }


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


    @Test
    public void test_InsureItemFilter() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        InsureItemDTO itemDTO = null;
        Map<String, Object> item = new HashMap<>();
        item.put("med_list_codg","medListCodg");
        item.put("drug_spec","drugSpec");
        item.put("drug_prodname","drugProdname");
        item.put("dosform","dosform");
        item.put("min_useunt","minUseunt");
        item.put("manufacturer_name","manufacturerName");
        item.put("pinyin","pinyin");
        item.put("wubi","wubi");
        item.put("null","null");
        item.put("vali_flag","valiFlag");
        item.put("compound_logo","compoundLogo");
        item.put("ver","ver");
        item.put("ver_name","verName");
        System.out.println("转换前："+ JSON.toJSONString(item));
        System.out.println("转换后："+JSON.toJSONString(Map2DTOAdapter.filter(item,link,InsureItemDTO.class)));

    }

}
