class BasketballStrategy implements GameStrategy {
    @Override
    public void initialize() {
        System.out.println("Initializing basketball game...");
    }

    @Override
    public void play() {
        System.out.println("Playing basketball game...");
    }

    @Override
    public void showResult() {
        System.out.println("Showing the results for the basketball game...");
    }
}
