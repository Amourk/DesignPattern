package designPattern.singleton;

/**
 * 单例模式---饿汉模式
 *
 * 不存在线程安全问题
 * 当类加载的时候，就已经完成了实例化，有可能没用到该实例，导致内存浪费(一点点，可忽略)
 *
 * @author yangrui
 * */
public class SingletonHungey {
    private static SingletonTest singletonTest = new SingletonTest();

    public SingletonTest getSingletonTest(){
        return singletonTest;
    }
}
