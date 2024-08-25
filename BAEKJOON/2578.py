import sys

sys.stdin = open('bingo.txt')

arr = [list(map(int, input().split())) for _ in range(5)]
mc = [list(map(int, input().split())) for _ in range(5)]
cnt = 0

def solution(arr: list):
    dx = [1, 1, 1, 0]
    dy = [-1, 0, 1, -1]
    bingo = 0

    for i in range(5):
        for j in range(5):
            if arr[i][j] == 0:
                for k in range(4):
                    cnt = 1
                    col = i
                    row = j
                    for l in range(1, 5):
                        col += dx[k]
                        row += dy[k]
                        if 0 <= col < 5 and 0 <= row < 5:
                            if arr[col][row] == 0:
                                cnt += 1
                                if cnt == 5:
                                    bingo += 1
    return bingo

for i in range(5):
    for j in range(5):
        for k in range(5):
            for l in range(5):
                if mc[i][j] == arr[k][l]:
                    arr[k][l] = 0
                    cnt += 1
                if cnt >= 12:
                    if solution(arr) >= 3:
                        print(cnt)
                        exit()


