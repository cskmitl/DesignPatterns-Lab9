class Sprinkler extends Device {
    public Sprinkler(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doTask() {
        System.out.println("I am sprinkler,... doing my task");
        endTask();
    }
}
