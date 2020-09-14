package designPattern.factory.abstractFactory;

public class AppleName implements Name {
    @Override
    public void getName() {
        System.out.println("苹果名字");
    }
}
