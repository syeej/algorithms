import sys
from collections import deque
input = sys.stdin.readline
directions = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

def bfs(curx, cury, desx, desy):
    q = deque()
    q.append((curx, cury))
    graph[curx][cury] += 1
    visited[curx][cury] = True
    
    while q:
        x, y = q.popleft()
        for d in directions:
            nx, ny = x+d[0], y+d[1]
            # 인접 좌표가 목적지 좌표와 같을 때
            if nx==desx and ny==desy:
                return graph[x][y]
            if 0<=nx<i and 0<=ny<i and not visited[nx][ny]:
                q.append((nx, ny))
                graph[nx][ny] = graph[x][y]+1
                visited[nx][ny] = True
    return 0

tc = int(input().strip())
for _ in range(tc):
    i = int(input().strip())
    graph = [[0]*i for _ in range(i)]
    visited = [[False]*i for _ in range(i)]
    curx, cury = map(int, input().strip().split())
    desx, desy = map(int, input().strip().split())
    if curx==desx and cury==desy:
      print(0)
    else:
      print(bfs(curx, cury, desx, desy))