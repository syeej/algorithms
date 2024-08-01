s = int(input())
num=0
sum=0
while sum<=s:
    num+=1
    sum+=num
    if sum>s:
      break
print(num-1)