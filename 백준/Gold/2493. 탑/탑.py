import sys
input = sys.stdin.readline

n = int(input())
toplist = list(map(int, input().split()))
answer = [0]*n
stack = []

for i in range(len(toplist)):
    while stack: #stack이 비어있지 않은 동안 실행
        if stack[-1][1] > toplist[i]:
            answer[i] = stack[-1][0] + 1 #인덱스 1부터 시작
            break
        else:
            stack.pop()
    stack.append((i, toplist[i])) #현재 탑의 인덱스와 높이 추가
print(*answer)