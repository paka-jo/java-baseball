package baseball;

public class Judgement {

    private BallCount ballCount;

    public Judgement(BallCount ballCount) {

        this.ballCount = ballCount;
    }

    public String result() {
       int strike = ballCount.strike().size();
       int ball = ballCount.ball().size();
       int nothing = ballCount.equalsNumber().size();

       return countBall(ball) + countStrike(strike)+ isNothing(nothing);
    }

    public String countStrike(int strike) {
        if(strike > 0){
            System.out.println(ballCount.strike().size() +"스트라이크");
        }return "";
    }

    public String countBall(int ball) {
            if (ball > 0) {
                System.out.println(ballCount.ball().size() + "볼");
            }return "";
        }

    public String isNothing(int nothing) {
        if( nothing == 0) {
            System.out.println("낫씽");
        }return "";
    }

}
