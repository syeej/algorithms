n = input().strip()
arr = [0] * 10

for ch in n:
    num = int(ch)
    if num == 6 or num == 9:
        arr[9] += 1
    else:
        arr[num] += 1

# '6'과 '9'는 서로 대체 가능하므로, 둘을 합쳐서 절반으로 나눔
if arr[9] % 2 == 0:
    arr[9] //= 2
else:
     arr[9] = arr[9] // 2 + 1

answer = max(arr)
print(answer)