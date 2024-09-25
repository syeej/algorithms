import sys
# from collections import deque
input = sys.stdin.readline

k = int(input())
# dq = deque()
arr = []
answer = 0
for _ in range(k):
    num = int(input())
    if num == 0:
        answer -= arr.pop()
    else:
        answer += num
        arr.append(num)
print(answer)
