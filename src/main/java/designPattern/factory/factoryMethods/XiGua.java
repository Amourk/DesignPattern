package designPattern.factory.factoryMethods;

public class XiGua implements FoodCharacteristics {
    @Override
    public void name() {
        System.out.println("西瓜");
    }

    @Override
    public void color() {
        System.out.println("西瓜颜色");
    }
}
