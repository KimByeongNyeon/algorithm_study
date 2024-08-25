import sys



T = int(sys.stdin.readline())
stack = []
for tc in range(T):
    N = int(sys.stdin.readline())
    if N != 0:
        stack.append(N)
    elif N == 0:
        stack.pop()

print(sum(stack))