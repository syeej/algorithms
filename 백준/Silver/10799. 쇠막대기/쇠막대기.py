import sys
input = sys.stdin.readline

str = input().strip()
stack = []
answer = 0

for i in range(len(str)):
  if str[i]=='(':
    stack.append(str[i])
  else:
    stack.pop()
    if str[i-1] == '(':
      answer += len(stack)
    else:
      answer +=1
print(answer)