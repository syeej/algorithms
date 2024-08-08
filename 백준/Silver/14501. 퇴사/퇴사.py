import sys
input = sys.stdin.readline
n = int(input())
tp = [list(map(int, input().split())) for _ in range(n)]
"""
tp = []
for _ in range(n):
    t, p = map(int, input().split())
    tp.append([t, p])
"""
dp = [0 for _ in range(n+1)]
for i in range(n-1, -1, -1):
  if i+tp[i][0] > n: #i일에 상담할 때 퇴사일을 넘기면 상담 안함
    dp[i] = dp[i+1]
  else:
    dp[i] = max(dp[i+1], tp[i][1] + dp[i+tp[i][0]])

print(dp[0])