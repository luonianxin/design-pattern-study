package org.luonianxin.learn.behavior.impl;

import org.luonianxin.learn.behavior.QuackBehavior;

/**
 *  真鸭子呱呱叫的行为实现
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:23
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("真的呱呱叫");
    }
}
