package baseball;

public class Judgement {

    private BallCount ballCount;

    public Judgement(BallCount ballCount) {

        this.ballCount = ballCount;
    }

    public String result() {
        StringBuilder sb = new StringBuilder();
        sb.append(countStrike())
                .append(countBall())
                .append(nothing());
        return sb.toString();
    }

    public String countStrike() {
        String sr = new String();
        if(ballCount.strike().size()>0){
        sr = (ballCount.strike().size() +"스트라이크");
        } return sr;
    }

    public String countBall() {
            String sr = new String();
            if (ballCount.ball().size() > 0) {
                sr= (ballCount.ball().size() + "볼");
            } return sr;
        }

    public String nothing() {
        String sr = new String();
        if(ballCount.equalsNumber().size() == 0) {
            sr ="낫씽";
        } return sr;
    }

}
