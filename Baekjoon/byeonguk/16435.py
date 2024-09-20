import sys
input = sys.stdin.readline

n, l = map(int, input().split())
fruit = list(map(int, input().split()))

fruit.sort()

for i in range(len(fruit)):
    if l < fruit[i]:
        break
    else:
        l += 1

print(l)