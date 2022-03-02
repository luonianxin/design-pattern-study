package org.luonianxin.study.design;

import java.util.concurrent.atomic.AtomicReference;

/**
 *   Effective Java作者推荐的枚举单例(线程安全)<p></p>
 *  这种写法在功能上与共有域方法相近，但是它更简洁，无偿地提供了串行化机制，绝对防止对此实例化，即使是在面对复杂的串行化或者反射攻击的时候。
 *  虽然这中方法还没有广泛采用，但是单元素的枚举类型已经成为实现Singleton的最佳方法。
 *
 * 但也要知道<font color="red">此种方式在存在继承场景下是不可用的。</font>
 *
 */
public enum Singleton_07 {

    INSTANCE;
    public void test(){
      System.out.println("hello singleton 7");
    }

}
