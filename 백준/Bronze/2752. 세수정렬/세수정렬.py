arr = list(map(int, input().split()))
arr.sort()
for i in range(len(arr)):
    print(arr[i], end=" ")