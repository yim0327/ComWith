def solution(numbers):
    numbers = list(map(str, numbers))  
    numbers.sort(key = lambda x : x * 3, reverse = True)
    result = str(int(''.join(numbers)))
    
    return result