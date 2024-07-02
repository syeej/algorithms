n, m = map(int, input().split())
arr = []

def dfs(start, depth):
    if depth==m:
       print(*arr)
       return
        #for i in arr:
        #    print(i,"", end="")
        #print()
        #return
    for i in range(start, n+1):
        arr.append(i)
        dfs(i, depth+1)
        arr.pop() #원상태로 돌림
 
dfs(1, 0)