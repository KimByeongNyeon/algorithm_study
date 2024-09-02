import sys
sys.setrecursionlimit(10 ** 5)

def dfs(v):
    global cnt
    visited[v] = cnt
    adjL[v].sort(reverse=True)
    for i in adjL[v]:
        if visited[i] == 0:
            cnt += 1
            dfs(i)


N, M, R = map(int, input().split())
adjL = [[] for _ in range(N + 1)]
visited = [0] * (N + 1)
cnt = 1
for i in range(M):
    v1, v2 = map(int, input().split())
    adjL[v1].append(v2)
    adjL[v2].append(v1)
dfs(R)
for i in range(1, N + 1):
    print(visited[i])
