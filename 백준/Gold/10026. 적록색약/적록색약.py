import sys
from collections import deque
input = sys.stdin.readline

def bfs(x, y, color):
    q = deque()
    q.append((x, y))
    visited[x][y] = True
    while q:
        curx, cury = q.popleft()
        for d in directions:
            nx, ny = curx+d[0], cury + d[1]
            if 0<=nx<n and 0<=ny<n and graph[nx][ny] == color and not visited[nx][ny]:
                q.append((nx, ny))
                visited[nx][ny] = True   
    
n = int(input())
directions = [(1, 0), (0, 1), (-1, 0), (0, -1)]
visited = [[False] * n for _ in range(n)]
graph = []
count = 0
for _ in range(n):
  row = list(input().strip())
  graph.append(row)
# 탐색
for i in range(n):
    for j in range(n):
        if graph[i][j] == 'R' and not visited[i][j]:
            bfs(i, j, 'R')
            count += 1
        elif graph[i][j] == 'B' and not visited[i][j]:
            bfs(i, j, 'B')
            count += 1
        elif graph[i][j] == 'G' and not visited[i][j]:
            bfs(i, j, 'G')
            count += 1
result = []
result.append(count)
# R->G
for i in range(n):
    for j in range(n):
        if graph[i][j] == 'R':
            graph[i][j] = 'G'
# 적록색약 탐색
visited = [[False] * n for _ in range(n)]
count = 0
for i in range(n):
    for j in range(n):
        if graph[i][j] == 'G' and not visited[i][j]:
            bfs(i, j, 'G')
            count += 1
        elif graph[i][j] == 'B' and not visited[i][j]:
            bfs(i, j, 'B')
            count += 1
result.append(count)

print(result[0], result[1])