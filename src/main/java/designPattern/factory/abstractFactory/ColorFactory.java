package designPattern.factory.abstractFactory;

public class ColorFactory extends FoodFactory {
    @Override
    public Color getColor(String type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case "apple":
                return new AppleColor();
            case "xiGua":
                return new XiGuaColor();
            case "puTao":
                return new PuTaoColor();
            default:
                return null;
        }
    }

    @Override
    public Name getName(String type) {
        return null;
    }
}
