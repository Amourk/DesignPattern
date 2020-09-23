package designPattern.proxy.staticProxy;

/**
 * 代理模式----静态代理
 * */
public class StaticProxyMain {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Proxy proxy = new Proxy(subject);
        proxy.requset();
    }
}
