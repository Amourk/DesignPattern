package designPattern.factory.easyFactory;

public class FoodFactory {
    public FoodCharacteristics getFood(String type) {
        switch (type) {
            case "apple":
                return new Apple();
            case "xiGua":
                return new XiGua();
            case "puTao":
                return new PuTao();
            default:
                return null;
        }
    }
}
