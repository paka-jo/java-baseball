package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class AiPlayer {

    private final BallCounting ballCounting;
    private String strike;
    private String ball;
    private String nothing;

    public AiPlayer(BallCounting ballCounting) {
        this.ballCounting = ballCounting;
    }

    public List<Integer> correct() {

        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public String checkBallsAndStrikes(List<Integer> correct,List<Integer> guess){
        List<Integer> numberOfStrike = ballCounting.getStrike(correct,guess);
        List<Integer> numberOfBall = ballCounting.getBall(correct,guess);
        strike ="";
        ball = "";
        nothing ="";

        if(numberOfStrike.size()>0){
            strike = numberOfStrike.size() + "스트라이크";
        }
        if(numberOfBall.size() >0) {
            ball = numberOfBall.size() + "볼";
        }
        if(numberOfStrike.size() == 0 && numberOfBall.size() == 0){
            nothing = ballCounting.getNothing();
        }
        return ball + " " + strike + nothing;
    }
}
