package designPattern.strategy;

/**
 * 上下文
 * 可添加公共的抽象方法/策略
 * */
public abstract class Context {
    RunStrategr runStrategr;

    public abstract void commonRun();

    public void setRunStrategr(RunStrategr runStrategr){
        this.runStrategr = runStrategr;
    }

    public void getRun(){
        runStrategr.run();
    }
}
