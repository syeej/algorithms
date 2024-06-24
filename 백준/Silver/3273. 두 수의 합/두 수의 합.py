import sys

n=int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
x = int(sys.stdin.readline())
arr.sort()
answer=0
left, right = 0, n-1

while left<right:
    tmp = arr[left] + arr[right]
    if tmp==x:
        answer+=1
        left+=1
    elif tmp<x:
        left+=1
    else:
        right-=1
print(answer)