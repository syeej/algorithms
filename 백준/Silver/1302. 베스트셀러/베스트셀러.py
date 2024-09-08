import sys
input = sys.stdin.readline
arr = dict()
n = int(input())
for _ in range(n):
    book = input().strip()
    if book not in arr:
        arr[book] = 0
    else:
        arr[book] +=1
# answer = sorted(arr.items(), key=lambda item:item[1], reverse = True)
answer = sorted(arr.items(), key= lambda item: (-item[1], item[0]))
print(answer[0][0])