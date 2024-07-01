import sys
from collections import deque

input = sys.stdin.readline
n = int(input())
q = deque()
num = 0
answer = []
for _ in range(n):
    word = list(input().split())
    if word[0] == 'push':
        num = word[1]
        q.append(num)
    elif word[0] == 'pop':
        if len(q) == 0:
            answer.append(-1)
        else:
            answer.append(q.popleft())
    elif word[0] == 'size':
        answer.append(len(q))
    elif word[0] == 'empty':
        if len(q)==0:
            answer.append(1)
        else:
            answer.append(0)
    elif word[0] == 'front':
        if len(q)==0:
            answer.append(-1)
        else:
            answer.append(q[0])
    elif word[0] == 'back':
        if len(q)==0:
            answer.append(-1)
        else:
            answer.append(num)

for i in answer:
    print(i)
    