import sys
input = sys.stdin.readline

n = int(input()) 
grid = [[*map(int, input().split())] for _ in range(n)]  

sorted_grid = sorted(grid, key=lambda x: (x[1], x[0]))

for x, y in sorted_grid:
    print(x, y)