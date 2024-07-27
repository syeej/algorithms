import sys
input = sys.stdin.readline
n = int(input())
requests = list(map(int, input().split()))
total = int(input())

start = 0
end = max(requests)
while start <= end:
  mid = (start+end)//2 #상한액
  sum = 0
  for req in requests:
    if req >= mid:
      sum += mid
    else:
      sum += req
  if sum<=total:
    start = mid+1
  else:
    end = mid-1
print(end)