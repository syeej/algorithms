import sys
input = sys.stdin.readline
n, k = map(int, input().split())
coins = []
for _ in range(n):
    coins.append(int(input().strip()))
coins.sort(reverse=True)
answer =0
for i in range(n):
    answer += k//coins[i]
    k%=coins[i]
print(answer)