from collections import deque
import sys
input = sys.stdin.readline
n, m = map(int, input().split())
num_list = list(map(int, input().split()))
q = deque(range(1, n+1))
count = 0

#search
for num in num_list:
    if q[0] == num: #원하는 값 나오면 pop
        q.popleft()
    else:
        idx = q.index(num)
        if idx <= len(q)//2:
            q.rotate(-idx)
            count += idx
        else:
            q.rotate(len(q)-idx)
            count += len(q) - idx
        q.popleft()
print(count)