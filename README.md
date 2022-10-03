# 숫자 야구 게임
## 구현 기능 목록
1) 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 생성하는 기능.
- [ ] 숫자 생성시 0이 포함되지 않도록 생성.
- [ ] 각 자리의 수가 서로 다른 3자리의 수 생성 (이전 자리의 수와 비교 필요).

2) 사용자로부터 3자리 수를 입력받는 기능.
- [ ] 1부터 9까지의 3자리 수가 입력되지 않은 경우 예외 처리 (문자 또는 3자리 미만, 초과의 경우, 0이 들어올 경우).
- [ ] 3자리 수 중에서 같은 수가 입력된 경우 예외 처리
- [ ] 0이 입력된 경우 - 첫번째 예외와 병합.

3)  스트라이크의 개수를 구하는 기능.
- [ ] 생성된 수와 입력된 수 비교 후 동일한 자리 - 동일한 수 의 개수 측정.

4) 볼의 개수를 구하는 기능.
- [ ] 생성된 수와 입력된 수 비교 후 서로 다른 자리 - 동일한 수 의 개수 측정.

5) 포볼(낫싱)인지 여부를 판단하는 기능.
- [ ] 스트라이크의 개수와 볼의 개수가 0일 경우로 판단.

6) 스트라이크, 볼, 또는 포볼(낫싱)에 대한 결과를 출력.
- [ ] 포볼(낫싱)일 경우를 출력.
- [ ] 위 경우가 아닐 시 스트라이크와 볼의 개수를 출력.

7) 답과 일치하면 게임을 종료하는 기능.
- [ ] 스트라이크의 개수가 3개이면 답과 일치하므로 게임 종료 ("게임 종료" 출력문도 함께 출력).

8) 게임을 종료한 후 다시 시작하거나 완전히 종료하는 기능.
- [ ] 1번을 입력 받으면 게임을 다시 시작 (구현해야 할 기능을 처음부터 다시 진행).
- [ ] 2번을 입력 받으면 게임(프로그램) 종료.
- [ ] 1또는 2가 아닌 입력이 들어올 경우 예외처리.

