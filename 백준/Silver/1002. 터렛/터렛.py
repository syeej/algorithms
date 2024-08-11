import sys
import math
input = sys.stdin.readline
T = int(input())
for _ in range(T):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    answer = 0
    #두 좌표의 거리
    dist = math.sqrt((x1-x2)**2 + (y1-y2)**2)
    # 두 원의 반지름 차이
    dif = abs(r1-r2)
    # 두 원이 일치할 경우
    if dist == 0 and dif == 0:
        answer = -1
    # 두 원이 외접하거나 내접할 경우
    elif dist == r1+r2 or dist == dif:
        answer = 1
    # 두 원이 두 점에서 만날 때 
    elif dif< dist < r1+r2:
        answer = 2
    print(answer)