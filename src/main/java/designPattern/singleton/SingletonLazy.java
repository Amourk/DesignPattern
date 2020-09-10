package designPattern.singleton;

/**
 * 单例模式----懒汉模式
 * */
public class SingletonLazy {

    private static SingletonTest singletonTest;

    /**
     * 1 可能会存在线程安全问题，多个线程可能会创建多个实例
     * */
    public SingletonTest getSingletonTest1(){
        if (singletonTest == null){
            /**
             * 当线程A进入判断中时，切换到线程B也进入到判断中，会创建两个实例
             * */
            singletonTest = new SingletonTest();
        }
        return singletonTest;
    }

    /**
     * 2 没有线程安全，但是锁颗粒度太大，效率低
     * */
    public synchronized SingletonTest getSingletonTest2(){
        if (singletonTest == null){
            singletonTest = new SingletonTest();
        }
        return singletonTest;
    }

    /**
     *3 问题同1
     */
    public SingletonTest getSingletonTest3(){
        if (singletonTest == null){
            synchronized (SingletonLazy.class){
                singletonTest = new SingletonTest();
            }
        }
        return singletonTest;
    }

    /**
     * 4 双重检验 没问题
     */
    public SingletonTest getSingletonTest4(){
        if (singletonTest == null){
            synchronized (SingletonLazy.class){
                if (singletonTest == null){
                    singletonTest = new SingletonTest();
                }
            }
        }
        return singletonTest;
    }
}
