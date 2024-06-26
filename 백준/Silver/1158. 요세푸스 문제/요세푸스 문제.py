from collections import deque

n, k = map(int, input().split())
q = deque(range(1, n + 1))

result = []
idx = 1

while len(q) > 0:
    if idx == k:
        result.append(q.popleft())
        idx = 1
    else:
        q.append(q.popleft())
        idx += 1

print("<" + ", ".join(map(str, result)) + ">")