import sys
from bisect import bisect
input = sys.stdin.readline
n = int(input())
cards = list(map(int, input().split()))
m = int(input())
checkList = list(map(int, input().split()))

dic = dict();
for c in cards:
    dic[c] = 0
for i in checkList:
    if i in dic:
        print(1, end = ' ')
    else:
        print(0, end =' ')