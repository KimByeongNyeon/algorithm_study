while True:
    N = int(input())
    stack = []
    if N == -1:
        break
    for i in range(1, N + 1):
        if N % i == 0:
            stack.append(i)
    stack.pop()
    if sum(stack) == N:
        print(f'{N} =', end=' ')
        print(' + '.join(map(str, stack)))
    else:
        print(f'{N} is NOT perfect.')

