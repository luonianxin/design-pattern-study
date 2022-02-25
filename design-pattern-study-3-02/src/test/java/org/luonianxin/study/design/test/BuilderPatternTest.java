package org.luonianxin.study.design.test;

import org.junit.Test;
import org.luonianxin.study.design.Builder;
import org.luonianxin.study.design.IMenu;

/**
 *  建造者模式单元测试类
 */
public class BuilderPatternTest {

    @Test
    public void test_Builder(){
        Builder builder = new Builder();
        // 豪华欧式
        IMenu levelOneDecoration = builder.levelOne(119.5D);
        // 轻奢田园
        IMenu levelTwoDecoration = builder.levelTwo(119.5D);
        // 现代简约
        IMenu levelThreeDecoration = builder.levelThree(119.5D);

        System.out.println(levelOneDecoration.getDetail());
        System.out.println(levelTwoDecoration.getDetail());
        System.out.println(levelThreeDecoration.getDetail());
    }
}
