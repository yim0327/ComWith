import sys
from collections import Counter

input = sys.stdin.readline

n = int(input())
book = []

for _ in range(n):
    book.append(input().strip())  # 개행문자 제거

# 각 책의 언급 횟수 세기
book_counter = Counter(book)
print(book_counter)
# 결과 -> Counter({'top' : 4, 'kimtop' : 1})

# 언급 횟수가 많은 순으로, 같다면 사전 순으로 정렬
best_seller = sorted(book_counter.items(), key=lambda x: (-x[1], x[0]))
print(best_seller)
# 결과 -> [('top', 4), ('kimtop', 1)]

print(best_seller[0][0])