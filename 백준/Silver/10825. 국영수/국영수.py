import sys
input = sys.stdin.readline
n = int(input())
arr = []
for _ in range(n): # 입력 : 이름 , 국, 영, 수
    arr.append(input().split())
#국어 내림 / 영어 오름/ 수학 내림 / 이름 오름
arr.sort(key=lambda x: (-int(x[1]), int(x[2]), -int(x[3]), x[0]))
for i in arr:
    print(i[0])