def dfs():
    if len(arr) == m:
        print(' '.join(map(str, arr)))
        return
    for i in range(n):
        if visited[i]:
            continue
        visited[i] = True
        arr.append(i+1)
        dfs()
        arr.pop()
        #print(arr)
        #print(visited)
        visited[i] = False
        
n, m = map(int, input().split())
arr = []
visited = [False]*n

dfs()