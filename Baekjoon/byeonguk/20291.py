from collections import Counter
import sys
input = sys.stdin.readline

n = int(input())
file = []
for _ in range(n):
    file.append(input().strip())

new_file = []
for i in file:
    new_file.append(i.split(".")[1])

file_counter = Counter(new_file)
sorted_file = sorted(file_counter.items(), key = lambda x : x[0])

for i in range(len(sorted_file)):
    print(sorted_file[i][0], sorted_file[i][1])