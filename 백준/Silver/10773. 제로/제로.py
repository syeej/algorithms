import sys
k = int(sys.stdin.readline())
arr = []
answer = 0
for _ in range(k):
    num = int(sys.stdin.readline())
    if num!=0:
        arr.append(num)
        answer += num
    else:
        answer -= arr.pop()
print(answer)