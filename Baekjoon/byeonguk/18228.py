import sys
input = sys.stdin.readline

n = int(input())  # 얼음의 갯수
ice_idx = list(map(int, input().split()))

peng_pos = ice_idx.index(-1)  # 펭귄의 위치
peng_left = min(ice_idx[:peng_pos])
peng_right = min(ice_idx[peng_pos + 1:])

print(peng_left + peng_right)