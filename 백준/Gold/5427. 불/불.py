import sys
from collections import deque
input = sys.stdin.readline
direction = [(1, 0), (0, 1), (-1, 0), (0, -1)]

def bfs():
    while fireq:
        cx, cy = fireq.popleft()
        for d in direction:
            nx, ny = cx+d[0], cy+d[1]
            if 0<=nx<h and 0<=ny<w and fireVis[nx][ny] == -1 and graph[nx][ny]!='#':
                fireVis[nx][ny] = fireVis[cx][cy]+1
                fireq.append((nx, ny))
    while q:
        cx, cy = q.popleft()
        for d in direction:
            nx, ny = cx + d[0], cy + d[1]
            # 범위 밖 = 탈출
            if nx<0 or nx>=h or ny<0 or ny>=w:
                return sgVis[cx][cy]+1
            # 상근이가 이미 지나왔거나 벽인 경우 skip
            if sgVis[nx][ny] != -1 or graph[nx][ny] == '#':
                continue
            # 불이 번져있고 상근이 도착시간 전에 불 날 경우 skip
            if fireVis[nx][ny] != -1 and fireVis[nx][ny] <= sgVis[cx][cy]+1 :
                continue
            # 상근 이동
            sgVis[nx][ny] = sgVis[cx][cy]+1
            q.append((nx, ny))
    return "IMPOSSIBLE"

t = int(input().strip())
global w, h, fireq, q, fireVis, sgVis
for _ in range(t):
    w, h = map(int, input().strip().split())
    graph = []
    fireVis = [[-1] * w for _ in range(h)]
    sgVis = [[-1] * w for _ in range(h)]
    q = deque()
    fireq = deque()
    for i in range(h):
        graph.append(list(input().strip()))
        for j in range(w):
            if graph[i][j] == '*':
                fireq.append((i, j))
                fireVis[i][j] = 0
            elif graph[i][j] == '@':
                q.append((i, j))
                sgVis[i][j] = 0

    print(bfs())
