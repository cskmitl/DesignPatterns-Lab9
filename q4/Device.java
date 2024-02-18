abstract class Device {
    protected Mediator mediator;

    public Device(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void doTask();

    public void endTask() {
        mediator.endAlarm(this);
    }
}
