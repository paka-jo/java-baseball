package baseball;

import camp.nextstep.edu.missionutils.Console;

public class GameHost {

    public void start() {
        System.out.println("숫자 야구 게임을 시작합니다");
    }

    public void end() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public String askRestart() {
        Start start = new Start();
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        int ask = Integer.parseInt(Console.readLine());
        if (ask == 1){
            start.runGame();
        } return "";
    }
}
