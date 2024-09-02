import sys
sys.setrecursionlimit(10 ** 6)


def make_tree(s, e):
    if s > e:
        return

    # 중간값 기준으로, 왼쪽 오른쪽 탐색 진행해야 하므로
    mid = e + 1
    # 시작점 + 1, 끝 + 1로 범위 설정
    for i in range(s + 1, e + 1):
        # 만약 i 가 시작점보다 크다면
        if arr[i] > arr[s]:
            # 중간 값 갱신
            mid = i
            break
    # 왼쪽 검사
    make_tree(s + 1, mid - 1)
    # 오른쪽 검사
    make_tree(mid, e)
    print(arr[s])


arr = []
while True:
    try:
        arr.append(int(input()))
    except:
        break

make_tree(0, len(arr) - 1)
