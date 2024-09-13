n, k = map(int, input().split())
A = [0] * n
count = 0

for i in range(n):
    A[i] = int(input())

A.sort(reverse=True)
for i in range(n):
    if A[i] <= k:
        count += int(k / A[i])
        k = k % A[i]

print(count)