package designPattern.strategy;

/**
 * 具体策略实现
 * */
public class CarConcreteStrategy implements RunStrategr{
    @Override
    public void run() {
        System.out.println("car");
    }
}
