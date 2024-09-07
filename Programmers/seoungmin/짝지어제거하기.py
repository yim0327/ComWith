def solution(s):
    answer = -1
    stack = []
    
    for char in s:
        if len(stack) > 0 and stack[-1] == char:
            stack.pop()
        else:
            stack.append(char)
            
    if not stack:
        answer = 1
    else:
        answer = 0

    return answer
