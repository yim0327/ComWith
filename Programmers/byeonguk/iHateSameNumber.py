def solution(arr):
    answer = []
    for i in range(len(arr)):
        if len(answer) > 0 and answer[-1] == arr[i]:
            continue
        else:
            answer.append(arr[i])
    return answer