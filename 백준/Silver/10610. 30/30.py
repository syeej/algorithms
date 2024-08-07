n = input()
#30의 배수가 되기 위한 조건 : 0이 있어야 함
if '0' not in n:
  print(-1)
else:
  sum = 0
  for i in n:
      sum+=int(i)
  if sum%3!=0:
      print(-1)
  else:
      arr = sorted(n, reverse=True)
      x = ''.join(arr)
      print(x)