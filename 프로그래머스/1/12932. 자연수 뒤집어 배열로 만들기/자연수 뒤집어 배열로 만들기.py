def solution(n):
    word = ''.join(reversed(str(n)))
    answer = list(map(int, word))
    return answer