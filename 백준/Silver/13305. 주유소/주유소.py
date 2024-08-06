import sys
input = sys.stdin.readline
n = int(input())
roads = list(map(int, input().split()))
prices = list(map(int, input().split()))
answer = 0
minPrice = prices[0]

for i in range(n-1):
    if minPrice > prices[i]:
        minPrice = prices[i]
    answer += minPrice * roads[i]
print(answer)