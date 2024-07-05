import sys
input = sys.stdin.readline
n = int(input())
count = 0
while n>0:
    words = list(input().strip())
    stack = []
    for word in words:
      if stack and stack[-1] == word:
        stack.pop()
      else:
        stack.append(word)
    if len(stack)==0:
        count +=1
    n-=1
print(count)