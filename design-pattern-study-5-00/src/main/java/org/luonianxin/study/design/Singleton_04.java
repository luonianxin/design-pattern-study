package org.luonianxin.study.design;

/**
 *  使用内部类<p>
 *
 *  使用类的静态内部类实现的单例模式，既保证了线程安全有保证了懒加载，同时不会因为加锁的方式耗费性能。
 * 这主要是因为JVM虚拟机可以保证多线程并发访问的正确性，也就是一个类的构造方法在多线程环境下可以被正确的加载。
 * 此种方式也是非常推荐使用的一种单例模式
 *
 */
public class Singleton_04 {

    private  static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04(){}

    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }
}
