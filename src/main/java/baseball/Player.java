package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Player {

    ExceptionMessage exceptionMessage = new ExceptionMessage();

    public List<Integer> guess() {
        System.out.print("숫자를 입력해주세요 : ");
        String[] input = Console.readLine().split("");
        exceptionMessage.checkInputLength(input);

        List<Integer> user = new ArrayList<>();
        for (String s : input) {
            user.add(Integer.parseInt(s));
        }
        return user;
    }

}
