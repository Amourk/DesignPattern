package designPattern.factory.easyFactory;

public class Apple implements  FoodCharacteristics{
    @Override
    public void name() {
        System.out.println("苹果");
    }

    @Override
    public void color() {
        System.out.println("苹果颜色");
    }
}
