package baseball;

import java.util.ArrayList;
import java.util.List;

public class BallCounting {

    private List<Integer> correct;
    private List<Integer> guess;

    public void setCorrect(List<Integer> correct) {
        this.correct = correct;
    }
    public void setGuess(List<Integer> guess) {
        this.guess = guess;
    }

    public List<Integer> getStrike(List<Integer> correct,List<Integer> guess) {
        List<Integer> sameNumber = new ArrayList<>();
        for(int i = 0; i <3; i++) {
           if(correct.get(i).equals(guess.get(i)) ){
               sameNumber.add(guess.get(i));
            }
        }return sameNumber;
    }

    public List<Integer> getBall(List<Integer> correct,List<Integer> guess) {
        List<Integer> common = new ArrayList<>(correct);
        common.retainAll(guess);
        common.removeAll(getStrike(correct,guess));
        return common;
    }

    public String getNothing() {
            return "낫싱";
    }
}



