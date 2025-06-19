package baseball;

public class ExceptionMessage {

    public void checkInputLength(String[] input) {
        if (input.length != 2) {
            throw new InputException("3자리 숫자를 입력하셔야됩니다");
        }
    }
}
