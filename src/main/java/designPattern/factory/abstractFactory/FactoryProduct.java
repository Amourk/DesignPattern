package designPattern.factory.abstractFactory;

public class FactoryProduct {
    public static FoodFactory getFactoryByType(String type){
        if ("colorFactory".equals(type)){
            return new ColorFactory();
        }else if ("nameFactory".equals(type)){
            return new NameFactory();
        }
        return null;
    }
}
