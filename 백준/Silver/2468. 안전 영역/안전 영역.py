from collections import deque
import sys

input = sys.stdin.readline

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

def bfs(x, y, standard):
    q = deque([(x, y)])
    visited[x][y] = True

    while q:
        cur_x, cur_y = q.popleft()
        for i in range(4):
            nx = cur_x + dx[i]
            ny = cur_y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue
            if visited[nx][ny] or graph[nx][ny] <= standard:
                continue
            visited[nx][ny] = True
            q.append((nx, ny))
    return 1

n = int(input())
graph = []
max_h = 0

for _ in range(n):
    row = list(map(int, input().split()))
    graph.append(row)
    max_h = max(max_h, max(row))

max_count = 0

for h in range(max_h + 1):
    count = 0
    visited = [[False] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if not visited[i][j] and graph[i][j] > h:
                count += bfs(i, j, h)
    max_count = max(max_count, count)

print(max_count)