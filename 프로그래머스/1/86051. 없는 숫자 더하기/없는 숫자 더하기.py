def solution(numbers):
    answer = 0
    for i in numbers:
        answer += i
    answer = 45-answer
    return answer