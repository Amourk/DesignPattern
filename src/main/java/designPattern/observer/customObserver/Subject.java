package designPattern.observer.customObserver;
/**
 * 主题接口
 * */
public interface Subject {
    /**
     * 注册观察者
     * */
    void addObserver(Observer observer);

    /**
     * 删除观察者
     * */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     * */
    void notifyObserver();
}
