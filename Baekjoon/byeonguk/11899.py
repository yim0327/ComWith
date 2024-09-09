brakets = list(input())
stack = []

for i in range(len(brakets)):
    if len(stack) > 0 and (stack[-1] == '(' and brakets[i] == ')'):
        stack.pop()
    else:
        stack.append(brakets[i])

print(len(stack))