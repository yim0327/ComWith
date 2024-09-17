import sys
input = sys.stdin.readline

n = int(input())
info = [[*input().split()] for _ in range(n)]

sorted_info = sorted(info, key=lambda x: (int(x[3]), int(x[2]), int(x[1])))

print(sorted_info[len(sorted_info) - 1][0])
print(sorted_info[0][0])