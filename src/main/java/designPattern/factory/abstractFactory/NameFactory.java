package designPattern.factory.abstractFactory;

public class NameFactory extends FoodFactory{
    @Override
    public Color getColor(String type) {
        return null;
    }

    @Override
    public Name getName(String type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case "apple":
                return new AppleName();
            case "xiGua":
                return new XiGuaName();
            case "puTao":
                return new PuTaoName();
            default:
                return null;
        }
    }
}
