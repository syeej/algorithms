import sys
input = sys.stdin.readline
n = int(input())
arr = [ [0 for _ in range(100)] for _ in range(100)]
for _ in range(n):
    x, y = map(int, input().split())
    for i in range(x, x+10):
        for j in range(y, y+10):
            arr[i][j] = 1 # 넓이에 해당하는 좌표는 1
result = 0
for i in range(100):
    result += arr[i].count(1) #1의 총 개수 = 넓이
print(result)