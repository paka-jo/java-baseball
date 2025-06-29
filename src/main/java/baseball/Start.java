package baseball;

import java.util.List;

public class Start {

    private final GameHost gameHost;
    private final AiPlayer aiPlayer;
    private final BallCounting ballCounting;
    private final Player player;

    public Start() {
        this.gameHost = new GameHost();
        this.ballCounting = new BallCounting();
        this.aiPlayer = new AiPlayer(ballCounting);
        this.player = new Player();
    }

    public void runGame() {
        gameHost.start();
        List<Integer> correct = aiPlayer.correct();
        ballCounting.setCorrect(correct);
        while (true) {
            List<Integer> guess = player.guess();
            ballCounting.setGuess(guess);

            System.out.println(aiPlayer.checkBallsAndStrikes(correct,guess));
            if (guess.equals(correct)) {
                System.out.println("3스트라이크");
                break;
            }
        }
        gameHost.end();
        gameHost.askRestart();
    }
}
