import sys
input = sys.stdin.readline

str = input().strip()
stack = []
tmp = 1
answer = 0

for i in range(len(str)):
    if str[i] == '(':
        stack.append(str[i])
        tmp *= 2
    elif str[i] == '[':
        stack.append(str[i])
        tmp *= 3
    elif str[i] == ')':
        #스택이 비어있거나 스택의 마지막 요소가 올바른 괄호가 아니면 종료
        if not stack or stack[-1]=='[':
            answer = 0
            break
        #이전 요소가 올바른 괄호면 정답에 tmp 더함
        if str[i-1]=='(':
            answer += tmp
        stack.pop()
        tmp //= 2 #tmp 초기화
    else:
        if not stack or stack[-1]=='(':
            answer = 0
            break
        if str[i-1] == '[':
            answer += tmp
        stack.pop()
        tmp //= 3
if stack:
    print(0)
else:
    print(answer)