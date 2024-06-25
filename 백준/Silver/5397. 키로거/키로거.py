import sys

t = int(input())
while t>0:
    answer = []
    right = []
    s = sys.stdin.readline().strip() # strip() 문자열 양 끝 공백 제거
    for i in s:
        if i == '<':
            if answer: #answer에 요소가 하나라도 있을 때
                right.append(answer.pop())
        elif i=='>':
            if right:
                answer.append(right.pop())
        elif i=='-':
            if answer:
                answer.pop()
        else:
            answer.append(i)
    answer.extend(reversed(right)) #right에 있는 문자열을 뒤집어서 answer에 추가
    print(''.join(answer)) #리스트를 문자열로 변환하여 출력
    t-=1