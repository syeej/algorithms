import sys
input = sys.stdin.readline
n = int(input())
arr = list(map(int, input().split()))
op = list(map(int, input().split()))

maxN = -1e9
minN = 1e9

def dfs(depth, ans, plus, minus, mul, div):
    global maxN, minN
    if depth == n:
        maxN = max(ans, maxN)
        minN = min(ans, minN)
        return
    if plus:
        dfs(depth+1, ans+arr[depth], plus-1, minus, mul, div)
    if minus:
        dfs(depth+1, ans-arr[depth], plus, minus-1, mul, div)
    if mul:
        dfs(depth+1, ans*arr[depth], plus, minus, mul-1, div)
    if div:
        dfs(depth+1, int(ans/arr[depth]), plus, minus, mul, div-1)
        #dfs(depth+1, ans//arr[depth], plus, minus, mul, div-1)

dfs(1, arr[0], op[0], op[1], op[2], op[3])
print(maxN)
print(minN)