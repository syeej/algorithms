import sys
input = sys.stdin.readline

n = int(input())
arr = []
dasom = int(input())
for _ in range(n-1):
    arr.append(int(input()))

answer = 0
arr.sort(reverse=True)

if n==1:
    answer = 0
else:
    while arr[0]>=dasom:
        dasom += 1
        answer += 1
        arr[0] -= 1
        arr.sort(reverse=True)
print(answer)