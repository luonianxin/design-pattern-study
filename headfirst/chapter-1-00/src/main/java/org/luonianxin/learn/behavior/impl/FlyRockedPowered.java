package org.luonianxin.learn.behavior.impl;

import org.luonianxin.learn.behavior.FlyBehavior;

/**
 *  新增一个利用火箭动力飞行的行为
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:51
 */
public class FlyRockedPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
