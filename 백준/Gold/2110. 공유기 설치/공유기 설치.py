import sys
input = sys.stdin.readline
n, c = map(int, input().split())
arr=[]
for i in range(n):
    arr.append(int(input()))
arr.sort()
start = 1
end = arr[n-1]-arr[0]
result = 0

while start<=end:
    mid = (start+end)//2 #현재 공유기 거리
    current = arr[0]
    count = 1

    # 공유기 설치 몇 대 할 수 있는지 체크
    for i in range(1, len(arr)):
        if arr[i] >= current + mid:
            count += 1
            current = arr[i]
    # 공유기 설치 수가 목표 보다 크면 공유기 사이 거리 늘림
    if count >= c:
        start = mid + 1
        result = mid
    # 공유기 설치 수가 목표 보다 작으면 공유기 사이 거리 줄임
    else:
        end = mid - 1

print(result)