class FootballStrategy implements GameStrategy {
    @Override
    public void initialize() {
        System.out.println("Initializing football game...");
    }

    @Override
    public void play() {
        System.out.println("Playing football game...");
    }

    @Override
    public void showResult() {
        System.out.println("Showing the results for the football game...");
    }
}
