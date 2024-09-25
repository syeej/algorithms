n = int(input())

def isHansu(x):
    arr = []
    while x>0:
        arr.append(x%10)
        x //= 10
    for i in range(0, len(arr)-2):
        dif1 = arr[i]-arr[i+1]
        dif2 = arr[i+1]-arr[i+2]
        if dif1 != dif2:
            return False
    return True
answer = 0
for i in range(1, n+1):
    if isHansu(i):
        answer+=1
print(answer)
