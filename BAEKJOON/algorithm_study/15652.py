def dfs(l):
    if len(result) == m:
        print(' '.join(map(str, result)))
        return

    for i in range(l, n + 1):
        result.append(i)
        dfs(i)
        result.pop()


n, m = map(int, input().split())
result = []
dfs(1)