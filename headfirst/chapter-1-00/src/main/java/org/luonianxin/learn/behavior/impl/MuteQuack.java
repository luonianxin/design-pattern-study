package org.luonianxin.learn.behavior.impl;

import org.luonianxin.learn.behavior.QuackBehavior;


/**
 *  木头鸭子不会叫行为实现
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:27
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
