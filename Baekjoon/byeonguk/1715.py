from queue import PriorityQueue
n = int(input())
pq = PriorityQueue()

for _ in range(n):
    pq.put(int(input()))

data1, data2 = 0, 0
sum = 0

while pq.qsize() > 1:
    data1 = pq.get()
    data2 = pq.get()
    new_bunch = data1 + data2
    sum += new_bunch
    pq.put(new_bunch)

print(sum)
