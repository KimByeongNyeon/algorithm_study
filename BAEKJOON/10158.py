w, h = map(int, input().split())
p, q = map(int, input().split())
t = int(input())


def DP():
    global x, y
    a = (p + t) // w
    b = (q + t) // h
    if a % 2 == 0:
        x = (p + t) % w
    else:
        x = w - (p + t) % w
    if b % 2 == 0:
        y = (q + t) % h
    else:
        y = h - (q + t) % h


DP()

print(x, y)