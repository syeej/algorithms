def solution(x):
    answer = True
    tmp = 0
    for s in str(x):
        tmp += int(s)
    if x%tmp != 0:
        answer = False
    return answer