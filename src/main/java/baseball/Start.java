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
        this.ballCount = new BallCount(computer,player);
        this.judgement = new Judgement(ballCount);
    }

    public void button() {
        computer.start();
        List<Integer> correct = computer.correct();
        while (!player.guess().equals(correct)) {
            judgement.result();
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
