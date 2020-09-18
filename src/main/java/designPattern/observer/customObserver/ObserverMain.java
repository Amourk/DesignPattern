package designPattern.observer.customObserver;

/**
 * 自定义观察者模式
 * */
public class ObserverMain {
    public static void main(String[] args) {
        SpecificSubject specificSubject = new SpecificSubject();
        SpecificObserver specificObserver = new SpecificObserver(specificSubject);
        specificSubject.notifyObserver();

    }
}
