import sys
input = sys.stdin.readline
n = int(input())
p = list(map(int, input().split()))
p.sort()
tmp = 0
answer = 0
for i in p:
    tmp += i
    answer += tmp
print(answer)