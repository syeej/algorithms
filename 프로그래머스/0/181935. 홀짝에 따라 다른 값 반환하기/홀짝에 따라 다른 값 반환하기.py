def solution(n):
    answer = 0
    if n%2==0:
        for i in range(n+1):
            if i%2==0:
                answer += i*i
    else:
        for i in range(n+1):
            if i%2!=0:
                answer += i
    return answer