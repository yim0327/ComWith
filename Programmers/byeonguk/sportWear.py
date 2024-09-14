def solution(n, lost, reserve):
    A = [1] * n
    
    for i in reserve:
        A[i-1] +=1
    
    for i in lost:
        A[i-1] -= 1
    
    for i in range(len(A)):
        if A[i] == 0:
            if i > 0 and A[i-1] == 2:
                A[i] = 1
                A[i-1] = 1
            elif i < n-1 and A[i+1] == 2:
                A[i] = 1
                A[i+1] = 1
                
    return len([x for x in A if x > 0])