import sys

input = sys.stdin.readline
n, m = map(int, input().split())
arr = dict()
for i in range(1, n+1):
    mon = input().strip()
    arr[i] = mon
    arr[mon] = i
for _ in range(m):
    mon = input().strip()
    if mon.isdigit():
        print(arr[int(mon)])
    else:
        print(arr[mon])
            