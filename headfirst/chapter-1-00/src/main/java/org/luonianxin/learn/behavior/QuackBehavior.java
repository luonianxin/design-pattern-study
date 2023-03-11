package org.luonianxin.learn.behavior;

/**
 *  将鸭子呱呱叫与叽叽叫的行为抽象成quack行为接口，不同行为都需要实现QuackBehavior接口的 quack方法
 * @author luonianxin
 * @version 1.0
 * @date 2023/3/11 13:21
 */
public interface QuackBehavior {
    void quack();
}
