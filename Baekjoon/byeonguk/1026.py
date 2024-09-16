import sys
input = sys.stdin.readline

n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

sum = 0
for i in range(n):
    sum += max(B) * min(A)
    A.pop(A.index(min(A)))
    B.pop(B.index(max(B)))

print(sum)