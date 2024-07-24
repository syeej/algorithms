import sys
input = sys.stdin.readline
n, c = map(int, input().split())
arr = list(map(int, input().split()))
data = dict()
for i in arr:
  data[i] = arr.count(i)
data2 = sorted(data.items(), key=lambda x: x[1], reverse=True)
for k, v in data2:
    for _ in range(v):
        print(k, end=" ")