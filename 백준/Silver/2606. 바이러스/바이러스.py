from collections import deque
import sys

input = sys.stdin.readline
n = int(input()) #컴퓨터 수
m = int(input()) #연결쌍 수
computers = [[] for _ in range(n+1)]
checked = [False]*(n+1) #감염 여부
for _ in range(m):
    x, y = map(int, input().split())
    computers[x].append(y)
    computers[y].append(x)

def dfs(x):
    global count # 전역변수
    checked[x] = True #감염 처리
    for i in computers[x]:
        if not checked[i]:
            count+=1
            dfs(i)
count = 0
dfs(1)
print(count)