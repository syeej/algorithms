import sys
input = sys.stdin.readline
n, m = map(int, input().split())
trees = list(map(int, input().split()))
#start, end = min(trees), max(trees)
start, end = 1, max(trees) #나무중 가장 짧은 길이 1

while start<=end:
    mid = (start+end)//2
    sum = 0
    for tree in trees:
        if tree>=mid:
            sum += (tree-mid)
    if sum >= m: # 목표(m) 이상일 경우
        start = mid+1
    else:
        end = mid-1
print(end)