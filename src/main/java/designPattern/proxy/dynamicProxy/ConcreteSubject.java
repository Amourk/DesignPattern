package designPattern.proxy.dynamicProxy;

public class ConcreteSubject implements Subject {
    @Override
    public void requset() {
        System.out.println("被代理类");
    }
}
