def gcd(a, b):
    if b==0:
        return a
    else:
        return gcd(b, a%b)
def lcm(a, b):
    return a*b//gcd(a, b)

n, m = map(int, input().split())
print(gcd(n, m))
print(lcm(n, m))