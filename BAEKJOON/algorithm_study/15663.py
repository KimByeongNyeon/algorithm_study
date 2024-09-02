def dfs():
    if len(result) == M:
        print(' '.join(map(str, result)))
    visit = 0
    for i in range(N):
        if arr[i] not in result and visit != arr[i]:
            result.append(arr[i])
            visit = arr[i]
            dfs()
            result.pop()


N, M = map(int, input().split())
arr = sorted(list(map(int, input().split())))
result = []
dfs()
