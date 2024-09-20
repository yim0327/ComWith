import sys
input = sys.stdin.readline

n = int(input())
row = {'A': 0, 'B': 1, 'C': 2, 'D': 3, 'E': 4, 'F': 5, 'G': 6,
  'H': 7, 'I': 8, 'J': 9       
}

seat = []
for _ in range(10):
  seat.append(['.'] * 20)

for _ in range(n):
  seat_num = input()
  alpha = seat_num[0]
  number = seat_num[1:]
  seat[row[alpha]][int(number) - 1] = 'o'

for i in range(10):
  for j in range(20):
    print(seat[i][j], end="")
    if (j + 1) % 20 == 0:
      print()