n = int(input())
plus = []
minus = []
sum = 0

for i in range(n):
    a = int(input())
    if a > 1:
        plus.append(a)
    elif a <= 0:
        minus.append(a)
    else:
        sum += a

plus.sort(reverse=True)
minus.sort()

for i in range(0, len(plus) - 1, 2):  
    sum += plus[i] * plus[i + 1]

if len(plus) % 2 == 1:
    sum += plus[-1]

for i in range(0, len(minus) - 1, 2):  
    sum += minus[i] * minus[i + 1]

if len(minus) % 2 == 1:
    sum += minus[-1]

print(sum)

'''
<실패한 코드 : 런타임 오류(IndexError)>
n = int(input())
plus = []
minus = []
sum = 0

for i in range(n):
    a = int(input())
    if a > 1:
        plus.append(a)
    elif a <= 0:
        minus.append(a)
    else:
        sum += a

plus.sort(reverse=True)
minus.sort()

for i in range(0, len(plus), 2):
    if len(plus) == 1:
        sum += plus[-1]
    else:
        sum += plus[i] * plus[i+1]

for i in range(0, len(minus), 2):
    if len(minus) == 1:
        sum += minus[-1]
    else:
        sum += minus[i] * minus[i+1]
        
print(sum)
'''