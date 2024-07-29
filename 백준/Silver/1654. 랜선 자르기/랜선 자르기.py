import sys
input = sys.stdin.readline
k, n = map(int, input().split())
lines = []
for _ in range(k):
  lines.append(int(input()))
start, end = 1, max(lines)

while start<=end:
    mid = (start+end)//2
    sum = 0
    for line in lines:
        sum += line//mid
    if sum>=n:
        start = mid+1
    else:
        end = mid-1
print(end)