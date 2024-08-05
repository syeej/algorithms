import sys
input = sys.stdin.readline
n = int(input())
weights = []
for _ in range(n):
    weights.append(int(input()))
weights.sort()
# print(weights[0]*n)
answer = []
for w in weights:
    answer.append(w*n)
    n-=1
print(max(answer))