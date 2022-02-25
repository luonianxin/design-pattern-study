package org.luonianxin.study.design;

import org.itstack.demo.design.Matter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *  装修包的实现类
 * <p></p>
 *  装修包的实现中每一个方法都返回了 this，也就可以非常方便的用于连续填充各项物料。
 * 同时在填充时也会根据物料计算平米数下的报价，吊顶和涂料按照平米数适量乘以常熟计算。
 * 最后同样提供了统一的获取装修清单的明细方法。
 *
 */
public class DecorationPackageMenu implements IMenu{

    private List<Matter> list = new ArrayList<Matter>();  // 装修清单
    private BigDecimal price = BigDecimal.ZERO;      // 装修价格

    private BigDecimal area;  // 面积
    private String grade;     // 装修等级；豪华欧式、轻奢田园、现代简约

    private DecorationPackageMenu() {
    }

    public DecorationPackageMenu(Double area, String grade) {
        this.area = new BigDecimal(area);
        this.grade = grade;
    }

    /**
     *  添加吊顶
     *
     * @param matter 吊顶物料
     */
    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    /**
     * 涂料
     *
     * @param matter
     */
    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("1.4")).multiply(matter.price()));
        return this;
    }

    /**
     * 地板
     *
     * @param matter
     */
    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    /**
     * 地砖
     *
     * @param matter
     */
    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    /**
     * 明细
     */
    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n==================================================================\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + grade + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" +
                "房屋面积：" + area.doubleValue() + " 平米\r\n" +
                "材料清单：\r\n");

        for (Matter matter: list) {
            detail.append(matter.scene()).append("：").append(matter.brand()).append("、").append(matter.model()).append("、平米价格：").append(matter.price()).append(" 元。\n");
        }

        return detail.toString();
    }
}
