import sys
input = sys.stdin.readline

# 왼손만 연주는 1, 오른손만 연주는 2, 양손 연주는 3
x, y = map(int, input().split())

left_hand = []
right_hand = []
answer = []

for i in range(1, x+1):
    left_hand.append((1/x) * i)

for i in range(1, y+1):
    right_hand.append((1/y) * i)

i, j = 0, 0
while i < len(left_hand) and j < len(right_hand):
    if abs(left_hand[i] - right_hand[j]) < 0.000001:
        answer.append('3')
        i += 1
        j += 1
    elif left_hand[i] < right_hand[j]:
        answer.append('1')
        i += 1
    else:
        answer.append('2')
        j += 1
   

while i < len(left_hand):
    answer.append('1')
    i += 1
        
while j < len(right_hand):
    answer.append('2')
    j += 1
    
print(''.join(answer))