import sys
input = sys.stdin.readline

# 2 x n은 화장실 바닥 크기, 2x1은 a개, 2x2는 b개
n, a, b = map(int, input().split())
one = list(map(int, input().split()))
two = list(map(int, input().split()))

one.sort()
two.sort()
answer = 0

if n % 2 == 1:
    answer += one[-1]
    one.pop()
    n -= 1
    
for _ in range(0 , n , 2):
    t1, t2 = 0, 0
    if len(one) >= 2:
        t1 = one[-1] + one[-2]
    if len(two) >= 1:
        t2 = two[-1]
    
    if t1 > t2:
        answer += t1
        one.pop()
        one.pop()
    else:
        answer += t2
        two.pop()
        
print(answer)