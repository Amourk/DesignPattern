package designPattern.factory.factoryMethods;

/**
 * 苹果类工厂，可生产不同种类的苹果
 * */
public class AppleFactory extends FoodFactory {
    @Override
    public FoodCharacteristics getFood() {
        return new Apple();
    }
}
