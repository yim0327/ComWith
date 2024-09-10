import sys
sys.setrecursionlimit(10000)
input = sys.stdin.readline
N, M = map(int, input().split())

#  그래프 데이터 리스트와 방문 기록 리스트 초기화
A = [[] for _ in range(N+1)]
visited = [False] * (N+1)

def dfs(v):
    visited[v] = True
    for i in A[v]:
        if not visited[i]:
            dfs(i)

#  방향이 없기 때문에 양쪽에 에지 추가
for _ in range(M):
    s, e = map(int, input().split())
    A[s].append(e)
    A[e].append(s)

count = 0

for i in range(1, N+1):
    #  연결 노드 중 방문하지 않았던 노드만 탐색
    if not visited[i]:
        count += 1
        dfs(i)

print(count)