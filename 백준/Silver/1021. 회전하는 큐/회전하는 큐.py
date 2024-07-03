from collections import deque
import sys
input = sys.stdin.readline
n, m = map(int, input().split())
num_list = list(map(int, input().split()))
q = deque(range(1, n+1))
count = 0

#search
for num in num_list:
    while True:
        if q[0] == num: #원하는 값 나오면 pop
            q.popleft() 
            break
        else:
            if q.index(num) <=len(q)//2:
                while q[0] != num:
                    q.append(q.popleft()) #2번 연산
                    count+=1
            else:
                while q[0] != num:
                    q.appendleft(q.pop()) #3번 연산
                    count+=1
print(count)