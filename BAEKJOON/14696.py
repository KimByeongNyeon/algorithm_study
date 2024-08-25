import sys

sys.stdin = open('ddakggi.txt')


def winner(a: list, b: list):
    global result
    lst_a = [a.count(4), a.count(3), a.count(2), a.count(1)]
    lst_b = [b.count(4), b.count(3), b.count(2), b.count(1)]

    for i in range(0, 4):
        if lst_a[i] > lst_b[i]:
            result = 'A'
            break
        elif lst_b[i] > lst_a[i]:
            result = 'B'
            break
        elif i == 3:
            result = 'D'
            break


T = int(input())
result = ''
for tc in range(1, T + 1):
    a = list(map(int, input().split()))[1:]
    b = list(map(int, input().split()))[1:]
    winner(a, b)
    print(result)
