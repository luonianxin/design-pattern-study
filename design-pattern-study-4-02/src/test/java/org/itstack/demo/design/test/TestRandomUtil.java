package org.itstack.demo.design.test;

import org.itstack.demo.design.util.Topic;
import org.itstack.demo.design.util.TopicRandomUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestRandomUtil {


    @Test
    public void test_RandomUtil() throws Exception {
        Map<String,String> map03 = new HashMap<String,String>();

        map03.put("A", "变量由字母、下划线、数字、$符号随意组成；");
        map03.put("B", "变量不能以数字作为开头；");
        map03.put("C", "A和a在java中是同一个变量；");
        map03.put("D", "不同类型的变量，可以起相同的名字；");

        String key = "B";

        Topic t = TopicRandomUtil.random(map03,key);



    }
}
