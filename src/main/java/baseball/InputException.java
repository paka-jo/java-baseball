package baseball;

public class InputException extends IllegalArgumentException {

    public void threeDigitsOver(String[] input) {
        if (input.length > 3) {
            System.out.println("3자리 숫자를 입력하셔야됩니다");
        }
    }
}
