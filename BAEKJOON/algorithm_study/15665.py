def dfs(l):
    if len(result) == M:
        print(' '.join(map(str, result)))
        return
    visit = 0
    for i in range(N):
        if visit != arr[i]:
            result.append(arr[i])
            visit = arr[i]
            dfs(l + 1)
            result.pop()


N, M = map(int, input().split())
arr = sorted(list(map(int, input().split())))
result = []
dfs(0)
