def dfs(l):
    if len(result) == M:
        print(' '.join(map(str, result)))
        return
    visit = 0
    for i in range(l, N):
        if visit != arr[i]:
            result.append(arr[i])
            visit = arr[i]
            dfs(i)
            result.pop()


N, M = map(int, input().split())
arr = sorted(list(map(int, input().split())))
result = []
dfs(0)
