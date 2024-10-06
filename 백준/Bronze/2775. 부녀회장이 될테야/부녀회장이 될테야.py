t = int(input())

for _ in range(t):
    f = int(input())
    num = int(input())
    arr = [x for x in range(1, num+1)]
    for k in range(f):
        for i in range(1, num):
            arr[i] += arr[i-1]
    print(arr[-1])