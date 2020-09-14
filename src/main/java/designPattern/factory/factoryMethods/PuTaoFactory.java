package designPattern.factory.factoryMethods;

/**
 * 葡萄类工厂
 * */
public class PuTaoFactory extends FoodFactory {
    @Override
    public FoodCharacteristics getFood() {
        return new PuTao();
    }
}
