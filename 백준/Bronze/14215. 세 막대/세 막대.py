a, b, c = map(int, input().split())
x = max(a, b, c)
y = a+b+c-x # 두 변의 길이의 합
if x >= y:
    x = y-1
print(x+y)