package designPattern.proxy.dynamicProxy;

/**
 *代理模式----动态代理
 **/
public class DynamicProxyMain {
    public static void main(String[] args) {
        ProxyHandler proxyHandler = new ProxyHandler();
        Subject o = (Subject) proxyHandler.newProxyInstance(new ConcreteSubject());
        o.requset();
    }
}
