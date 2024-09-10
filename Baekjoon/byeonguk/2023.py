import sys
sys.setrecursionlimit(10000)
input = sys.stdin.readline

N = int(input())

#  소수 판별 함수
def isPrime(num):
    for i in range(2, int(num / 2 + 1)):
        if num % i == 0:
            return False
    
    return True
    
def dfs(number):
    if len(str(number)) == N:
        print(number)
    else:
        for i in range(1, 10):
            if i % 2 == 0:  #  짝수면 탐색할 필요없음
                continue
            if isPrime(number * 10 + i):  #  소수이면 자릿수를 하나 늘린다
                dfs(number * 10 + i)

dfs(2)
dfs(3)
dfs(5)
dfs(7)