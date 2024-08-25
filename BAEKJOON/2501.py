N, K = map(int, input().split())
stack = []

for i in range(1, N+1):
    if N % i == 0:
        stack.append(i)


if len(stack) < K:
    print(0)
else:
    print(stack[K-1])
