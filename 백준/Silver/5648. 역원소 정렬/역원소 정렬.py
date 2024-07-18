import sys
# 입력이 끝날 때까지(Ctrl+D) 입력을 받을 수 있음
input = sys.stdin.read

n, *nums = input().split()
# print(n, nums)
# 10 ['5', '2233', '1601', '90100', '13009', '802', '50000000', '301', '7654321', '210']
for i in range(int(n)):
    nums[i] = int(nums[i][::-1]) #문자열 슬라이싱 기법 역순
nums.sort()
for i in nums:
  print(i)