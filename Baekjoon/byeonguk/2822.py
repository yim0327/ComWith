scores = []
for _ in range(8):
    scores.append(int(input()))

score_idx = []
sum = 0

sorted_scores = sorted(enumerate(scores, 1), key = lambda x : x[1], reverse=True)
for idx, score in sorted_scores[:5]:
    score_idx.append(idx)
    sum += score

score_idx.sort()
print(sum)
for i in score_idx:
    print(i, end = " ")
    
# 입력 : 20 30 50 48 33 66 0 64
# 출력 : 261 3 4 5 6 8