package designPattern.singleton;

/**
 * 单例模式---枚举
 * */
public enum SingletonEnum {
    //枚举对象(单例的)
    SINGLETON_ENUM;

    private SingletonTest singletonTest;
    private SingletonEnum(){
        singletonTest = new SingletonTest();
    }

    public SingletonTest getSingletonTest(){
        return singletonTest;
    }
}


