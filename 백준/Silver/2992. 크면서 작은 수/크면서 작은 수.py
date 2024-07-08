import sys
from itertools import permutations

input = sys.stdin.readline
x = input().strip()
arr = list(permutations(x, len(x)))
nums=[]
for i in arr:
    num = int(''.join(i))
    if num> int(x) and num not in nums:
        nums.append(num)
        nums.sort()
if nums:
    print(nums[0])
else:
    print(0)
