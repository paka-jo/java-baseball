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
- `start()` : 게임 시작 문구를 출력합니다
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

## Start 클래스
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

