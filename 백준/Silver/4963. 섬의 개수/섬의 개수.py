from collections import deque
import sys
input = sys.stdin.readline
dx = [1, 0, -1, 0, 1, 1, -1, -1]
dy = [0, 1, 0, -1, 1, -1, 1, -1]

def bfs(x, y):
    visited[x][y] = True
    q = deque([(x, y)])
    while q:
        curx, cury = q.popleft()
        for i in range(8):
            nx, ny = curx+dx[i], cury+dy[i] 
            if 0<=nx<h and 0<=ny<w:
                if not visited[nx][ny] and graph[nx][ny]==1:
                    visited[nx][ny] = True
                    q.append((nx, ny))
    
while True:
    w, h = map(int, input().split())
    if w==0 and h==0: break
    graph = []
    visited = [[False]*w for _ in range(h)]
    count = 0
    for _ in range(h):
        graph.append(list(map(int, input().split())))
    
    for x in range(h):
        for y in range(w):
            if graph[x][y]==1 and not visited[x][y]:
                bfs(x, y)
                count +=1
    print(count)