from collections import deque
n, k = map(int, input().split())
q = deque()
for i in range(1, n+1):
    q.append(str(i))
answer = []
idx = 1
while len(q)!=1:
    if idx==k:
        answer.append(q.popleft())
        idx = 1
    else:
        idx+=1
        q.append(q.popleft())
answer.append(q.popleft())
print('<' + ', '.join(answer) + '>')