import sys
input = sys.stdin.readline
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
result = 0
a.sort()
for i in range(n):
    result += a[i]*max(b)
    b.remove(max(b))
print(result)