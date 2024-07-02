import sys
from collections import deque
input = sys.stdin.readline

def bfs(x, y):
  q = deque()
  q.append([x, y])
  visited[x][y] = True
  size = 1
  while q:
      x, y = q.popleft()
      for i in range(4):
          nx = x + dx[i]
          ny = y + dy[i]
          if 0<=nx<n and 0<=ny<m:
              if visited[nx][ny]==False and graph[nx][ny]==1:
                  size += 1
                  visited[nx][ny] = True
                  q.append([nx, ny])
  return size

n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(map(int, input().split())))
#visited = [[False]*m]*n
visited = [[False]*m for _ in range(n)]
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
answer = []

for i in range(n):
    for j in range(m):
        if graph[i][j]==1 and visited[i][j] == False:
            pic = bfs(i,j)
            answer.append(pic)
            #visited[i][j] = True
            
if len(answer) == 0:
  print(len(answer))
  print(0)
else:        
  print(len(answer))
  print(max(answer))