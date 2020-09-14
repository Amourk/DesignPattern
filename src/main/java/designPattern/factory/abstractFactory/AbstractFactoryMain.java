package designPattern.factory.abstractFactory;

/**
 * 抽象工厂模式
 * */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        FoodFactory colorFactory = FactoryProduct.getFactoryByType("colorFactory");
        FoodFactory nameFactory = FactoryProduct.getFactoryByType("nameFactory");

        Color apple = colorFactory.getColor("apple");
        Name apple1 = nameFactory.getName("apple");
        apple.getColor();
        apple1.getName();

        Color xiGua = colorFactory.getColor("xiGua");
        Name xiGua1 = nameFactory.getName("xiGua");
        xiGua.getColor();
        xiGua1.getName();

        Color puTao = colorFactory.getColor("puTao");
        Name puTao1 = nameFactory.getName("puTao");
        puTao.getColor();
        puTao1.getName();
    }
}
