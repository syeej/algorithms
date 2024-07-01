n, m = map(int, input().split())
arr = [-1]*m
def dfs(depth):
    if depth==m:
        for i in arr:
            print(i,"", end="")
        print()
        return
    for i in range(n):
        arr[depth] = i+1
        dfs(depth+1)

dfs(0)
        