package designPattern.observer.customObserver;

/**
 * 具体观察者
 * */
public class SpecificObserver implements Observer {

    SpecificSubject specificSubject;

    public SpecificObserver(SpecificSubject specificSubject) {
        this.specificSubject = specificSubject;
        this.specificSubject.addObserver(this);
    }

    @Override
    public void action() {
        System.out.println("观察到主题发生了改变");
    }
}
