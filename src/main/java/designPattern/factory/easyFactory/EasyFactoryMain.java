package designPattern.factory.easyFactory;

/**
 * 工厂模式---简单工厂模式
 * 违反了“闭开”原则
 * */
public class EasyFactoryMain {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        FoodCharacteristics apple = foodFactory.getFood("apple");
        apple.color();
        apple.name();

        FoodCharacteristics xiGua = foodFactory.getFood("xiGua");
        xiGua.color();
        xiGua.name();

        FoodCharacteristics puTao = foodFactory.getFood("puTao");
        puTao.color();
        puTao.name();
    }
}
