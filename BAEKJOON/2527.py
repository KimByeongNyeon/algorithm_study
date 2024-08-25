for _ in range(4):
    x1, y1, p1, q1, x2, y2, p2, q2 = map(int, input().split())

    # d: 전혀 겹치지 않는 경우
    if p1 < x2 or p2 < x1 or q1 < y2 or q2 < y1:
        print('d')
    # c: 한 점에서 만나는 경우
    elif (x1 == p2 and y1 == q2) or (x1 == p2 and q1 == y2) or (p1 == x2 and y1 == q2) or (p1 == x2 and q1 == y2):
        print('c')
    # b: 한 변에서 만나는 경우
    elif x1 == p2 or p1 == x2 or y1 == q2 or q1 == y2:
        print('b')
    # a: 겹치는 경우
    else:
        print('a')
