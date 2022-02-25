package org.itstack.demo.design.ceiling;

import org.itstack.demo.design.Matter;

import java.math.BigDecimal;

/**
 *  吊顶
 *品牌：装修公司自带
 *型号：一级顶
 */
public class LevelOneCeiling implements Matter {
    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    @Override
    public String scene() {
        return "吊顶";
    }

    /**
     * 品牌
     */
    @Override
    public String brand() {
        return "装修公司自带";
    }

    /**
     * 型号
     */
    @Override
    public String model() {
        return "一级顶";
    }

    /**
     * 平米报价
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    /**
     * 描述
     */
    @Override
    public String desc() {
        return "造型只做低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
