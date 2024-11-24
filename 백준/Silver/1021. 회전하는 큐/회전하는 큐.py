from collections import deque
import sys
input = sys.stdin.readline
n, m = map(int, input().split())
arr = list(map(int, input().split()))
dq = deque(range(1, n+1))
count = 0

for num in arr:
    idx = dq.index(num)
    if idx <= len(dq)//2:
        dq.rotate(-idx)
        count += idx
    else:
        dq.rotate(len(dq)-idx)
        count += len(dq) - idx
    dq.popleft()
print(count)