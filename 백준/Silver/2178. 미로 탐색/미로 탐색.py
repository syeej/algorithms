from collections import deque
import sys

input = sys.stdin.readline
n, m = map(int, input().split())
# 방향
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
# 2차원 리스트 생성
graph = [list(map(int, ''.join(input().split()))) for _ in range(n)]

q = deque([(0, 0)])

while q:
    x, y = q.popleft()
    for i in range(4):
        nx, ny = x+dx[i], y+dy[i]
        if 0<=nx<n and 0<=ny<m:
            if graph[nx][ny] == 1:
                q.append((nx, ny))
                graph[nx][ny] = graph[x][y]+1

print(graph[n-1][m-1])