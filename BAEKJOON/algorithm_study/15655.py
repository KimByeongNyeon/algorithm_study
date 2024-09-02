def dfs(l):
    if len(result) == M:
        print(' '.join(map(str, result)))
        return

    for i in range(l, N):
        if arr[i] not in result:
            result.append(arr[i])
            dfs(i)
            result.pop()


N, M = map(int, input().split())
arr = sorted(list(map(int, input().split())))
result = []
dfs(0)