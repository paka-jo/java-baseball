package baseball;

import java.util.ArrayList;
import java.util.List;

public class BallCount {

    private List<Integer> correct;
    private List<Integer> guess;

    public void setCorrect(List<Integer> correct) {
        this.correct = correct;
    }

    public void setGuess(List<Integer> guess) {
        this.guess = guess;
    }

    public List<Integer> getCorrect() {
        return correct;
    }

    public List<Integer> getGuess() {
        return guess;
    }

    public List<Integer> strike() {
        List<Integer> sameNumber = new ArrayList<>();
        for(int i = 0; i <3; i++) {
           if(getCorrect().get(i) == getGuess().get(i)){
               sameNumber.add(getCorrect().get(i));
            }
        }return sameNumber;
    }

    public List<Integer> ball() {
        equalsNumber().retainAll(strike());

        return equalsNumber();
    }

    public List<Integer> equalsNumber() {
        getGuess().retainAll(getCorrect());

        return getGuess();
    }
}



