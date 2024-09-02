def chk(start):
    for i in range(start):
        # 가로, 대각선 이 찍혀 동잃하다면
        if visited[i] == visited[start] or abs(visited[start] - visited[i]) == abs(start - i):
            # 못 감
            return True
    return False


def dfs(start):
    global cnt

    if start == N:
        cnt += 1
        return cnt

    else:
        for j in range(N):
            # 방문 체크
            visited[start] = j
            # 만약 갈 수 있다면
            if not chk(start):
                # 재귀호출
                dfs(start + 1)


N = int(input())
visited = [0] * N
cnt = 0
dfs(0)
print(cnt)

