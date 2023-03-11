package org.luonianxin.learn.behavior.impl;

import org.luonianxin.learn.behavior.QuackBehavior;

/**
 *  橡皮鸭子吱吱叫行为实现
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:24
 */
public class Squeak  implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是橡皮鸭子，吱吱叫~");
    }
}
