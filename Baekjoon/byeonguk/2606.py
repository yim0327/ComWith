n = int(input())
k = int(input())

graph = [[] for i in range(n+1)]

# 0 : 미방문, 1 : 방문
visited = [0] * (n+1)

for i in range(k):
  node1, node2 = map(int, input().split())
  graph[node1].append(node2)
  graph[node2].append(node1)


# 방문할 컴퓨터 번호를 입력받음
def dfs(node):
  # 방문했으니 1로 표시
  visited[node] = 1

  # graph[node]는 node번 컴퓨터에 연결된 컴퓨터들의 리스트
  for i in graph[node]:
    # 그 컴퓨터들 중 방문되지 않은 컴퓨터면 다시 dfs 실행해서 방문
    if visited[i] == 0:
      dfs(i)

dfs(1)

# 1번 컴퓨터와 연결된 컴퓨터 개수 출력(1번 컴퓨터는 제외)
print(sum(visited) - 1)