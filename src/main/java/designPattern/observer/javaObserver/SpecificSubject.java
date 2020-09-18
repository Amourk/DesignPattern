package designPattern.observer.javaObserver;

import java.util.Observable;

/**
 * 具体主题 继承Observable类
 *
 * void setChange() 方法：
 * 用来设置一个 boolean 类型的内部标志位，注明目标对象发生了变化。当它为真时，notifyObservers() 才会通知观察者。
 * */

public class SpecificSubject extends Observable {
}
