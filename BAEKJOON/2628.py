N, M = map(int, input().split())
width = [N, 0]
height = [0, M]
T = int(input())
for _ in range(1, T + 1):
    w, h = map(int, input().split())

    if w == 0:
        height.append(h)
    else:
        width.append(h)
width.sort()
height.sort()

result = []
for i in range(1, len(width)):
    for j in range(1, len(height)):
        w1 = width[i] - width[i-1]
        h1 = height[j] - height[j-1]
        result.append(w1 * h1)

print(max(result))


