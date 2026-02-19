## Player 클래스 (사용자로 부터 숫자를 입력받음)
### 기능
- `guess()`: 사용자 입력을 받아 숫자 리스트로 반환 

## AiPlayer 클래스 (상대방)
### 기능
- `correct()` :랜덤한 3자리의 숫자를 반환
- `checkBallsAndStrikes()` : 입력받은 사용자의 숫자에 대해 결과를 볼,스트라이크,낫싱으로 결과값 반환

### 상태값
- `ballcounting : BallCounting`
- `strike : String`
- `ball : String`
- `nothing : String`

## GameHost 클래스
### 기능 
- `baseballGame()` : 게임 시작 문구를 출력합니다
- `end()` : 3스트라이크 시 게임 종료 문구를 출력합니다
- `askRestart()` : 1입력시 종료, 2 입력 시 재시작을 합니다

## BallCounting 클래스
### 기능
- `setCorrect` : aiPlayer가 출력한 값을 가져옵니다
- `setGuess` : 사용자가 예측한 숫자를 가져옵니다
- `getStrike()` : 같은 자리의 숫자가 일치할 시 해당 횟수에 따라 스트라이크를 출력합니다
- `getBall()` : 다른 자리의 숫자가 일치할 시 해당 횟수에 따라 볼을 출력합니다
- `getNothing()` : 같은 숫자가 전혀 없을 시 낫싱을 출력합니다

### 상태값
- `guess : List<Integer> `
- `correct : List<Integer> `

## BaseballGame 클래스
### 기능
- `runGame()` : 게임을 진행합니다

### 상태값
- `gameHost : GameHost`
- `aiPlayer : AiPlayer`
- `ballCounting :BallCounting`
- `player : Player`

## ExceptionMessage
### 기능
- `checkInputLength` : player 입력 숫자가 3자리에 대한 예외사항

## 리팩토링에 대한 피드백 내용
- 현재 마크다운 문서는 클래스 중심으로 되어 있음 -> 앞으로는 객체중심으로 작성
- 클래스와 객체 대한 이해와 공부가 필요함
- 연관 관계가 과함
- 필드에 대해서 초기화를 할 때 생성자를 만들어서 초기화 해도 된다
ex) ``` public AiPlayer(BallCounting ballCounting) {
    this.ballCounting = ballCounting;
    } ```
-> ```  public AiPlayer() {
        this.ballCounting = new BallCuonting(); 
    }```
- 클래스 명은 동사X, 명사 (Play 클래스 = 동사임)
- 메서드명을 좀 더 명확하게!
ex) `GameHost`에서 메서드명 `start` -> `printStart`, `end` -> `printEnd`,
`AiPlayer`에서 `correct`-> `pickRandomNumber` 
- `Setter`는 최대한 사용x
- static 메서드에 대해서 공부해보고 `BallCounting` 클래스에서 활용 + 필드 선언이 필요x
- 객체 다이어그램을 그리고 시작하는것도 좋음
