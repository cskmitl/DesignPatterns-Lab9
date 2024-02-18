class Game {
    private GameStrategy strategy;

    public Game(GameStrategy strategy) {
        this.strategy = strategy;
    }

    public void play() {
        strategy.initialize();
        strategy.play();
        strategy.showResult();
    }
}
