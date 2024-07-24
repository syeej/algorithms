import sys
input = sys.stdin.readline
num = 1
answer = []
def isPalindrome(x):
    if len(x)%2==0:
        for i in range(len(x)//2+1):
            if x[i]!=x[len(x)-1-i]:
                return False
        return True
    else:
        for i in range(len(x)//2):
            if x[i]!=x[len(x)-1-i]:
                return False
        return True
        
while num!=0:
  num = int(input())
  if isPalindrome(str(num)):
      answer.append('yes')
  else:
      answer.append('no')
for i in range(len(answer)-1):
    print(answer[i])
