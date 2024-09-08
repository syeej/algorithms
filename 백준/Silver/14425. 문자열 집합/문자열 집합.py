import sys

input = sys.stdin.readline
n, m = map(int, input().split())
arr = []
for _ in range(n):
    word = input().strip()
    arr.append(word)
answer = 0
for _ in range(m):
    k = input().strip()
    if k in arr:
        answer+=1
print(answer)