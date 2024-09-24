import sys
sys.setrecursionlimit(10**6)

n = int(sys.stdin.readline())

graph = [[] for i in range(n+1)]
for i in range(n-1):
    node1, node2 = map(int, sys.stdin.readline().split())
    graph[node1].append(node2)
    graph[node2].append(node1)

visited = [0] * (n+1)

def dfs(node):
    for i in graph[node]:
        if visited[i] == 0:
            visited[i] = node
            dfs(i)

dfs(1)

for i in visited[2:]:
    print(i)