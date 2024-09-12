s = input().strip()

temp = []
answer = []

for i in range(len(s)):
    # 닫힌 괄호가 나오면
    if s[i] == '>':
        temp.append('>')
        # 그대로 최종 리스트에 추가
        answer.append(''.join(temp))
        # 임시 리스트 초기화
        temp = []
    # 열린 괄호가 나왔는데 이전에 입력된 것들이 있다면
    elif s[i] == '<' and temp:
        # 임시 리스트를 뒤집어서 추가
        temp.reverse()
        answer.append(''.join(temp))
        # 임시 리스트 초기화
        temp = [s[i]]
    # 공백 문자인데 괄호 밖이라면
    elif s[i] == ' ' and '<' not in temp:
        # 임시 리스트 뒤집어서 추가
        temp.reverse()
        answer.append(''.join(temp))
        answer.append(' ')
        # 임시 변수 초기화
        temp = []
    else:
        temp.append(s[i])
# 아직 임시 변수에 문자열이 남아있다면 뒤집어서 추가
if temp: 
    temp.reverse()
    answer.append(''.join(temp))
# 문자열로 반환
print(''.join(answer))