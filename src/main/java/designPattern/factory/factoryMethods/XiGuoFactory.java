package designPattern.factory.factoryMethods;

/**
 * 西瓜类工厂
 * */
public class XiGuoFactory extends FoodFactory {
    @Override
    public FoodCharacteristics getFood() {
        return new XiGua();
    }
}
