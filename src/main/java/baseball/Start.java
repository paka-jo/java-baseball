package baseball;

import java.util.List;

public class Start {

    private final Computer computer;
    private final BallCount ballCount;
    private Player player;
    private Judgement judgement;

    public Start() {
        this.computer = new Computer();
        this.player = new Player();
        this.ballCount = new BallCount();
        this.judgement = new Judgement(ballCount);
    }

    public void button() {
        computer.start();
        List<Integer> correct = computer.correct();
        ballCount.setCorrect(correct);
        while (true) {
            List<Integer> guess = player.guess();
            ballCount.setGuess(guess);

            judgement.result();
            if (guess.equals(correct)) break;
        }
        computer.end();
        int ask = computer.askRestart();
        if(ask == 1){
            restart();
        }
        exit();


    }

    public void restart() {
        button();
    }

    public void exit() {
        System.exit(0);
    }
}
