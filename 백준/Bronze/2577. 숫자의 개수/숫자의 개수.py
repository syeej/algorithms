a = int(input())
b = int(input())
c = int(input())
arr = list(str(a*b*c))

for i in range(10):
    print(arr.count(str(i)))