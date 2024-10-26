def solution(a, b):
    answer = 0
    if a>=b:
        tmp = b
        b = a
        a = tmp
    for x in range(a, b+1):
        answer += x
    return answer