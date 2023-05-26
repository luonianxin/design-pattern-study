package org.luonianxin.learn.subject;

import org.luonianxin.learn.observer.Observer;

/**
 * @author luonianxin
 * @version 1.0
 * @date 2023/5/26 20:56
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer o);
    void notifyObservers();
}
