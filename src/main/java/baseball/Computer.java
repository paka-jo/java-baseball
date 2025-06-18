package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

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

    public void start() {
        System.out.println("숫자 야구 게임을 시작합니다");
    }

    public void end() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public int askRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        return Integer.parseInt(Console.readLine());
    }



}
