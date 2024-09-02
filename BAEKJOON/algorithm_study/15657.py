def dfs(l):
    if len(result) == m:
        print(' '.join(map(str, result)))
        return

    for i in range(l, n):
        result.append(arr[i])
        dfs(i)
        result.pop()


n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
result = []
dfs(0)
