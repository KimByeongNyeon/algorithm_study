dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

N, M = map(int, input().split())  # N: 행의 수, M: 열의 수
K = int(input())

if K > N * M:
    print(0)
else:
    i, j = 0, 0
    num = 1
    l = 1  # 방향을 오른쪽으로 시작
    arr = [[0 for _ in range(M)] for _ in range(N)]  # N x M 크기의 배열

    arr[i][j] = num
    while num < K:
        ci = i + dx[l]
        cj = j + dy[l]

        if ci < 0 or ci >= N or cj < 0 or cj >= M or arr[ci][cj] != 0:
            l = (l + 1) % 4
            ci = i + dx[l]
            cj = j + dy[l]

        i, j = ci, cj
        num += 1
        arr[ci][cj] = num

    # 최종 위치 출력, 1 기반 인덱스로 변환
    print(i + 1, j + 1)
# c, r = map(int, input().split())  # 가로 세로
# k = int(input())  # 총 시행 횟수
# arr = [[0] * (r + 1) for _ in range(c + 1)]
# dij = [[0, 1], [1, 0], [0, -1], [-1, 0]]  # 오 아 왼 위
#
#
# def find_seat():
#     if k > r * c:  # 예외처리
#         return
#     move = 0
#     idx = 1
#     i, j = 1, 1
#     while idx <= k:
#         arr[i][j] = idx
#         ni = i + dij[move % 4][0]
#         nj = j + dij[move % 4][1]
#         if 0 < ni <= c and 0 < nj <= r and arr[ni][nj] == 0:
#             i, j = ni, nj
#         else:
#             move += 1  # 방향 바꾸기
#             i, j = i + dij[move % 4][0], j + dij[move % 4][1]
#
#         idx += 1
#
#
# def find_xy():
#     for i in range(c + 1):
#         for j in range(r + 1):
#             if arr[i][j] == k:
#                 return i, j
#     return 0,
#
#
# find_seat()
# print(*find_xy())
