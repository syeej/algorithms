# 승률(z)이 기준
x, y = map(int, input().split())
z = 100*y//x
start, end = 1, 1000000000 # x의 범위
count = 0
#승률이 더 오르지 않을 때는 a현재 승률이 99이상
if z>=99:
    print(-1)
else:
    while start<=end:
        mid = (start+end)//2
        if (y+mid)*100//(x+mid) <= z:
            start = mid+1
        else:
            count = mid
            end = mid-1
    print(count)