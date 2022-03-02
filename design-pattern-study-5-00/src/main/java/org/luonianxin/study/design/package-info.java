/**
 *  单例模式可以说是整个设计中最简单的模式之一，而且这种方式即使在没有看设计模式相关资料也会常用在编码开发中。
 *
 * 因为在编程开发中经常会遇到这样一种场景，那就是需要保证一个类只有一个实例哪怕多线程同时访问，并需要提供一个全局访问此实例的点。
 *
 * 综上以及我们平常的开发中，可以总结一条经验，单例模式主要解决的是，一个全局使用的类频繁的创建和消费，从而提升提升整体的代码的性能。
 <p>
 7种单例模式实现
 <p>
 单例模式的实现方式比较多，主要在实现上是否支持懒汉模式、是否线程安全中运用各项技巧。

 当然也有一些场景不需要考虑懒加载也就是懒汉模式的情况，会直接使用static静态类或属性和方法的方式进行处理，供外部调用。
 */
package org.luonianxin.study.design;