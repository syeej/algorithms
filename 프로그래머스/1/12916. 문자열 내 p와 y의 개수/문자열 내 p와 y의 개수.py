def solution(s):
    answer = True
    count = 0
    s = s.upper()
    for i in s:
        if i=='P':
            count += 1
        elif i=='Y':
            count -= 1
    if count != 0:
        answer = False
    return answer