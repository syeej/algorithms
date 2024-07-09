def solution(n, m, section):
    answer = 1
    startR = section[0]
    for idx in range(1, len(section)):
        if startR+m <= section[idx]:
            answer += 1
            startR = section[idx]
        
    return answer