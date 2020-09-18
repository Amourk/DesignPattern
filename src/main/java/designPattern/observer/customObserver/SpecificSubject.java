package designPattern.observer.customObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 * */
public class SpecificSubject implements Subject {

    private final List<Observer> observerLit;

    public SpecificSubject() {
        this.observerLit = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerLit.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerLit.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerLit) {
            observer.action();
        }
    }
}
