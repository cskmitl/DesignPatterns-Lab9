class CoffeePot extends Device {
    public CoffeePot(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void doTask() {
        System.out.println("I am coffee pot,... doing my task");
        endTask();
    }
}
