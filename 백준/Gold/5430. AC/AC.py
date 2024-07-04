from collections import deque
import sys
input = sys.stdin.readline
t = int(input())
while t>0:
    p = input().strip() #수행할 함수
    n = int(input().strip()) #배열 개수
    arr = input().strip()
    q = deque(arr[1:-1].split(","))
    if n==0:
        q = []
    rcount = 0
    flag = True
    for i in p:
        if i == "R":
          rcount += 1
        elif i == "D":
          if len(q) == 0:
            flag = False
            break
          else:
            if rcount%2==0:
              q.popleft()
            else:
              q.pop()
    if flag:
        if rcount%2!=0 :
            q.reverse()
        print("["+",".join(list(q))+"]")
    else:
        print("error")
    t-=1