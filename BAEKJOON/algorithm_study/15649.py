def dfs():
    if len(result) == M :
        print(' '.join(map(str, result)))

    for i in range(N):
        result.append(i)
        dfs()
        result.pop()


N, M = map(int, input().split())
result = []
dfs(1)