import sys
import math
input = sys.stdin.readline
t = int(input())
for _ in range(t):
    n = int(input()) #해빈이가 가진 의상 수
    closet = {}
    answer = 1
    typeCount = 0
    for i in range(n):
        clothes, type = input().split()
        if closet.get(type):
            closet[type] += 1
        else:
            closet[type] = 1
            typeCount +=1
    for k,v in closet.items():
        answer *= (v+1)
    print(answer-1)