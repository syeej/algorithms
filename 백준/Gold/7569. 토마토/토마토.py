import sys
from collections import deque

input = sys.stdin.readline
m, n, h = map(int, input().split())
graph = []
for _ in range(h):
    g = []
    for _ in range(n):
        g.append(list(map(int, input().split())))
    graph.append(g)
visited = [[[[False] for _ in range(m)] for _ in range(n)] for _ in range(h)]
directions = [(1, 0, 0), (0, 1, 0), (-1, 0, 0), (0, -1, 0), (0, 0, 1), (0, 0, -1)]
day = 0
q = deque()

def bfs():
    global day
    while q:
        cx, cy, cz = q.popleft()
        for d in directions:
            nx, ny, nz = cx + d[0], cy + d[1], cz + d[2]
            #인접한 좌표가 범위 안이고 아직 안 익은 상태 토마토인 경우
            if 0 <= nx < h and 0 <= ny < n and 0 <= nz < m and graph[nx][ny][nz] == 0:
                q.append((nx, ny, nz))
                graph[nx][ny][nz] = graph[cx][cy][cz] + 1
                day = graph[cx][cy][cz]

# 모두 익지 않은 상황인지 체크
def isGood():
    for i in range(h):
        for j in range(n):
            for k in range(m):
                if graph[i][j][k] == 0:
                    return False
    return True

# 익은 토마토 -> 큐(덱)
for i in range(h):
    for j in range(n):
        for k in range(m):
            if graph[i][j][k] == 1:
                q.append((i, j, k))
                visited[i][j][k] = True
# 탐색
bfs()

if isGood():
    print(day)
else:
    print(-1)
