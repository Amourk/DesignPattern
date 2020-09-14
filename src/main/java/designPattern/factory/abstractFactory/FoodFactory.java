package designPattern.factory.abstractFactory;

public abstract class FoodFactory {
    public abstract Color getColor(String type);
    public abstract Name getName(String type);
}
