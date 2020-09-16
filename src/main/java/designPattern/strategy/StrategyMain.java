package designPattern.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Context people = new People();
        people.commonRun();
        people.setRunStrategr(new AirConcreteStrategy());
        people.getRun();

        Context person = new People();
        person.commonRun();
        person.setRunStrategr(new CarConcreteStrategy());
        person.getRun();
    }
}
