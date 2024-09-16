str = input()

suffix = []
for i in range(len(str)):
    suffix.append(str[i:])
    
suffix.sort()
for i in range(len(suffix)):
    print(suffix[i])