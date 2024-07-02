def solution(n):
    arr = list(str(n))
    arr.sort(reverse=True)
    res = ''
    for i in arr:
        res += str(i)
    answer = int(res)
    return answer