## Dynamic Programming (동적계획법)

* `큰 문제를 작은 문제로 나눠서 푸는 알고리즘`
  * 분할 정복과 같지만 메모이제이션이 필요하지 않으므로 동적계획법과 차이가 있음.
* 연산이 반복되는 것을 보완하기 위함 --> 예) 피보나치 수열
* Memoization (메모이제이션)
    * 하위 문제를 해결할 때 그 해결책을 저장해 두고, 같은 문제가 발생했을 때 저장되어 있던 해결책을 가지고 해결
    * 동일한 문제를 반복해야 할 경우, 한 번 계산된 결과를 저장했다 활용하는 방식으로 `중복 계산을 줄이는 것`
        * 시간 복잡도도 줄어듦.
* Top-Down : 위에서 아래로 내려오는 방식(재귀) --> 함수의 호출을 줄이기 위해 메모이제이션을 사용
    * 큰 문제를 작은 문제로 나눠 접근 
* Bottom-Up : for문을 이용해 처음값부터 다음값을 계산해 나가는 방식
    * 작은문제부터 큰문제로 접근
