from collections import deque


T = int(input())
deq = deque(enumerate(map(int, input().split())))

result = []

while deq:
    idx, rotate = deq.popleft()
    result.append(idx + 1)

    if rotate > 0:
        deq.rotate(-(rotate - 1))

    elif rotate < 0:
        deq.rotate(-rotate)

print(' '.join(map(str, result)))