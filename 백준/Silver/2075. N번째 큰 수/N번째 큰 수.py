import sys, heapq
input = sys.stdin.readline

n = int(input())
hq = []

for _ in range(n):
    nums = map(int, input().split())
    for num in nums:
        if len(hq)<n:
            heapq.heappush(hq, num)
        else:
            if hq[0] < num:
                heapq.heappop(hq)
                heapq.heappush(hq, num)
print(hq[0])