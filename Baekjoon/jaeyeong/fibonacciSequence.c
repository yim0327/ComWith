#include <stdio.h>
#include <stdlib.h>

// memoization용 구조체 선언
typedef struct {
    int zero;
    int one;
} Count;

Count fibonacci(int n, Count* memo) {
    if (n == 0) { // 0번 째 피보나치 수
        memo[0].zero = 1;
        memo[0].one = 0;
        return memo[0];
    }
    if (n == 1) { // 1번 째 피보나치 수
        memo[1].zero = 0;
        memo[1].one = 1;
        return memo[1];
    }
    if (memo[n].zero != -1 && memo[n].one != -1) { // n번 째 피보나치 수 (n > 1)
        return memo[n];
    }

    Count c1 = fibonacci(n - 1, memo);
    Count c2 = fibonacci(n - 2, memo);

    memo[n].zero = c1.zero + c2.zero;
    memo[n].one = c1.one + c2.one;

    return memo[n];
}

int main(void) {
    // case 개수
    int t;
    scanf("%d", &t);

    // output배열에 n번 째 피보나치 수 입력 (input t번)
    int* print = (int*)malloc(t * sizeof(int)); // print : output용 배열
    for (int i = 0; i < t; i++) {
        scanf("%d", &print[i]);
    }

    // 피보나치 수 계산 후 출력
    for (int i = 0; i < t; i++) {
        int n = print[i];
        Count* memo = (Count*)malloc((n + 1) * sizeof(Count)); // memo : memoization용 배열
        for (int j = 0; j <= n; j++) { // memo배열 초기화
            memo[j].zero = -1;
            memo[j].one = -1;
        }

        Count result = fibonacci(n, memo); // 계산된 피보나치 수(함수)를 구조체 변수에 저장 < 꺼내기
        printf("%d %d\n", result.zero, result.one); // 구조체 변수 출력 < 꺼낸거 출력

        free(memo);
    }

    free(print);
    return 0;
}
