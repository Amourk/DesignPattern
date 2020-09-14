package designPattern.factory.factoryMethods;

public class PuTao implements FoodCharacteristics {
    @Override
    public void name() {
        System.out.println("葡萄");
    }

    @Override
    public void color() {
        System.out.println("葡萄颜色");
    }
}
