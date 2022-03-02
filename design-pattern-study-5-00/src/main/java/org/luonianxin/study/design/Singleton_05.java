package org.luonianxin.study.design;

/**
 *   双重锁校验(线程安全)<p>
 *   懒汉模式的另外一种实现,双重锁的方式是方法级锁的优化，减少了部分获取实例的耗时。
 *
 */
public class Singleton_05 {

    private static Singleton_05 instance = null;


    private Singleton_05(){}

    public static Singleton_05 getInstance() {
        if(null != instance) return instance;
        synchronized(Singleton_05.class){
            if(null == instance) {
                instance = new Singleton_05();
            }
         }
        return instance;
    }
}
