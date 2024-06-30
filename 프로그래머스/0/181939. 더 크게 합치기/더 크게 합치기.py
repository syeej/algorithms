def solution(a, b):
    answer = 0
    if int(str(a)+str(b))>=int(str(b)+str(a)):
        answer = int(str(a)+str(b))
    else:
        answer = int(str(b)+str(a))
    return answer