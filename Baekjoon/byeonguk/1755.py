num_dict = {
    "0": "zero", "1": "one", "2": "two", "3": "three",
    "4": "four", "5": "five", "6": "six", "7": "seven",
    "8": "eight", "9": "nine"
}

m, n = map(int, input().split())
num_list = []

for i in range(m, n + 1):
    if i < 10:
        num_list.append((i, num_dict.get(str(i))))  
    else:
        word_rep = num_dict.get(str(i)[0]) + " " + num_dict.get(str(i)[1])
        num_list.append((i, word_rep))

num_list.sort(key=lambda x: x[1])

print(num_list)
'''
[(8, 'eight'), (9, 'nine'), (18, 'one eight'), 
(15, 'one five'), (14, 'one four'), (19, 'one nine'), 
(11, 'one one'), (17, 'one seven'), (16, 'one six'), 
(13, 'one three'), (12, 'one two'), (10, 'one zero'), 
(28, 'two eight'), (25, 'two five'), (24, 'two four'), 
(21, 'two one'), (27, 'two seven'), (26, 'two six'), 
(23, 'two three'), (22, 'two two'), (20, 'two zero')]
'''

for idx, num in enumerate(num_list):
    print(num[0], end=" ")
    if (idx + 1) % 10 == 0:
        print()

'''
출력 : 
8 9 18 15 14 19 11 17 16 13 
12 10 28 25 24 21 27 26 23 22 
20
'''