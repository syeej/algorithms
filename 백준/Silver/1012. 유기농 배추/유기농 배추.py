import sys
from collections import deque
input = sys.stdin.readline

def bfs(x, y):
  global bug
  q = deque()
  q.append((x, y))
  visited[x][y] = True
  while q:
    curx, cury = q.popleft()
    for d in directions:
      nx, ny = curx+d[0], cury+d[1]
      if 0<=nx<m and 0<=ny<n and graph[nx][ny]== 1 and not visited[nx][ny]:
        q.append((nx, ny))
        visited[nx][ny] = True
  bug+=1

directions = [(1, 0), (0, 1), (-1, 0), (0, -1)]
t = int(input())

for _ in range(t):
    m, n, k = map(int, input().split())
    graph = [[0] * n for _ in range(m)]
    visited = [[False] * n for _ in range(m)]
    bug = 0
    for _ in range(k):
        x, y = map(int, input().split())
        graph[x][y] = 1
    for i in range(m):
        for j in range(n):
            if graph[i][j] == 1 and not visited[i][j]:
                bfs(i, j)
    print(bug)
