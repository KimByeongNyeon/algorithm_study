def dfs():
    if len(result) == M:
        print(' '.join(map(str, result)))
        return
    visit = 0
    for i in range(N):
        if not visited[i] and visit != arr[i]:
            visited[i] = True
            result.append(arr[i])
            visit = arr[i]
            dfs()
            visited[i] = False
            result.pop()


N, M = map(int, input().split())
arr = sorted(list(map(int, input().split())))
result = []
visited = [False] * N
dfs()
