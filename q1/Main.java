public class Main {
    public static void main(String[] args) {
        Game footballGame = new Football();
        footballGame.play();

        System.out.println();

        Game basketballGame = new Basketball();
        basketballGame.play();
    }
}
