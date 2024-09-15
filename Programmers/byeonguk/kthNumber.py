def solution(array, commands):
    answer = []
    for i in range(len(commands)):
        start = commands[i][0]
        end = commands[i][1]
        k = commands[i][2]

        new_array = array[start-1:end]
        new_array.sort()
        answer.append(new_array[k-1])

    return answer