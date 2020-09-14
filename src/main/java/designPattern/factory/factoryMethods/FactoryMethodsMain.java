package designPattern.factory.factoryMethods;

/**
 * 工厂方法模式
 * */
public class FactoryMethodsMain {
    public static void main(String[] args) {
        Apple apple = (Apple) new AppleFactory().getFood();
        apple.name();
        apple.color();

        PuTao puTao = (PuTao) new PuTaoFactory().getFood();
        puTao.color();
        puTao.name();

        XiGua xiGua = (XiGua) new XiGuoFactory().getFood();
        xiGua.color();
        xiGua.name();
    }
}