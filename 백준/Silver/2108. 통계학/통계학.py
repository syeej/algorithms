import sys
input = sys.stdin.readline
n = int(input())
arr = []
for _ in range(n):
    arr.append(int(input()))
#산술평균
print(round(sum(arr)/n))
#중앙값
arr.sort()
print(arr[n//2])
#최빈값
x = dict()
for i in arr:
    if i in x:
        x[i] += 1
    else:
        x[i] = 1
# 빈도수가 가장 높은 값
maxX = max(x.values())
xKey = []
for k in x:
    if maxX == x[k]:
        xKey.append(k)
if len(xKey)>1:
    print(xKey[1])
else:
    print(xKey[0])
#범위
print(max(arr)-min(arr))