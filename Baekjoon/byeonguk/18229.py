import sys
input = sys.stdin.readline

n, m, k = map(int, input().split())
hand = [[*map(int, input().split())] for _ in range(n)]

winner = []

for i in range(n):
    total, count = 0, 0
    for j in range(m):
        total += hand[i][j]
        count += 1
        if total >= k:
            winner.append(count)
            break
    else:
        winner.append(float('inf'))  # K를 넘지 못한 경우를 대비해 아주 큰 값 추가

# 최소 값을 가진 플레이어의 번호와 count 출력
min_value = min(winner)
min_index = winner.index(min_value) + 1  # 1-based 인덱스
print(min_index, min_value)