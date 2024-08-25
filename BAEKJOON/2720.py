T = int(input())
changes = [25, 10, 5, 1]
for tc in range(1, T + 1):
    C = int(input())

    result = []
    for i in changes:
        result.append(C // i)
        C = C % i

    print(*result)