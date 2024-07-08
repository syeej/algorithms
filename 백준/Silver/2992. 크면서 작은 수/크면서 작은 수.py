import sys
from itertools import permutations

input = sys.stdin.readline
n = input().strip()
#입력된 문자열의 모든 순열
r = list(permutations(n, len(n)))
nums=[]

for i in r:
    num = int(''.join(i)) #순열 -> 정수 변환
    #n보다 큰 수면서 중복이 아닌 경우
    if num> int(n) and num not in nums:
        nums.append(num)

if nums:
  nums.sort()
  print(nums[0])
else:
  print(0)