import sys
input = sys.stdin.readline
#n: 온도 측정한 전체 날짜 수 / k: 합을 구하기 위한 연속적인 날짜 수(1<k<n) 
n, k = map(int, input().split())
arr = list(map(int, input().split()))
sum_arr = []
total = 0
for i in arr:
    total += i
    sum_arr.append(total)

answer = sum(arr[:k]) # 처음 k일 연속 합
for i in range(n-k):
    if answer < (sum_arr[i+k]-sum_arr[i]):
        answer = (sum_arr[i+k]-sum_arr[i])
print(answer)