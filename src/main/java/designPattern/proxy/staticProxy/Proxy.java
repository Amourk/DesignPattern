package designPattern.proxy.staticProxy;

public class Proxy implements Subject {

    Subject subject = null;

    public Proxy(){
        this.subject = new Proxy();
    }

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void requset() {
        //增强被代理类执行前
        //todo before()
        subject.requset();
        //增强被代理类执行后
        //todo after();
    }
}
