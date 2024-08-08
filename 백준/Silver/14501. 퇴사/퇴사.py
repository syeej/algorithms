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
"""
# Top-Down
for i in range(n-1, -1, -1):
  if i+tp[i][0] > n: #i일에 상담하면 퇴사일을 넘기면 상담 안함
    dp[i] = dp[i+1]
  else:
    # i일에 상담 vs 상담 안하는 것 중 큰 값 선택
    dp[i] = max(dp[i+1], tp[i][1] + dp[i+tp[i][0]])
print(dp[0])
"""
#Bottom-up
for i in range(n):
    for j in range(i+tp[i][0], n+1):
        if dp[j] < dp[i]+tp[i][1]:
            dp[j] = dp[i] + tp[i][1]
print(dp[-1])