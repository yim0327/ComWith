n = int(input())
A = list(map(int, input().split()))

set_list = list(set(A))
set_list.sort()

for i in set_list:
    print(i, end=" ")