package baseball;

import java.util.ArrayList;
import java.util.List;

public class BallCount {

    private final Computer computer;
    private Player player;

    public BallCount(Computer computer,Player player) {
        this.computer = computer;
        this.player = player;
    }


    public List<Integer> strike() {
        List<Integer> sameNumber = new ArrayList<>();
        for(int i = 0; i <3; i++) {
           if(computer.correct().get(i) == player.guess().get(i)){
               sameNumber.add(computer.correct().get(i));
            }
        }return sameNumber;
    }

    public List<Integer> ball() {
        equalsNumber().retainAll(strike());

        return equalsNumber();
    }

    public List<Integer> equalsNumber() {
        player.guess().retainAll(computer.correct());

        return player.guess();
    }
}



