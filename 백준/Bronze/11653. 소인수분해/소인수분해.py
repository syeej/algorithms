import math

n = int(input())
d = 2
sqrt = int(math.sqrt(n))

while d<=sqrt:
    if n%d!=0:
        d+=1
    else:
        print(d)
        n//=d
if n>1:
    print(n)