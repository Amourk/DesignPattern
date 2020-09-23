package designPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 动态代理只能代理接口
 * 需要实现InvocationHandler接口和Proxy.newProxyInstance方法
 *
 * */
public class ProxyHandler implements InvocationHandler {

    /**
     * 被代理对象
     * */
    private Object target;


    public Object newProxyInstance(Object target){
        this.target = target;

        /**
         *public static Object newProxyInstance(ClassLoader var0, Class<?>[] var1, InvocationHandler var2)
         * ClassLoader var0 被代理类加载器
         * Class<?>[] var1 被代理类实现的接口
         * InvocationHandler var2 被代理类实例
         *
         * */
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
        return o;
    }

    /**
     * object o 被代理的对象
     * Method method 要调用的方法
     * Object[] objects 调用方式时的参数
     * 具体实现类调用方法时将执行invoke方法
     * */
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object ret = null;
        //todo 增强被代理类执行前
        brfore();
        ret = method.invoke(target,objects);
        //todo 增强被代理类执行前
        after();
        return ret;
    }

    private void brfore(){
        System.out.println("被代理类执行前");
    }

    private void after(){
        System.out.println("被代理类执行后");
    }
}
