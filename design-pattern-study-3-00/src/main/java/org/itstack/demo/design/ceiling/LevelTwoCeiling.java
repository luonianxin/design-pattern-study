package org.itstack.demo.design.ceiling;

import org.itstack.demo.design.Matter;

import java.math.BigDecimal;

/**
 *  吊顶
 *品牌：装修公司自带
 *型号：二级顶
 */
public class LevelTwoCeiling implements Matter {
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
        return "二级顶";
    }

    /**
     * 平米报价
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    /**
     * 描述
     */
    @Override
    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层高很高，也可增加每级的厚度";
    }
}
