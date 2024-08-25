import sys

input = sys.stdin.readline


def push(stack, x):
    stack.append(x)


def pop(stack):
    if stack:
        print(stack.pop())
    else:
        print(-1)


def size(stack):
    print(len(stack))


def is_empty(stack):
    print(1 if not stack else 0)


def top(stack):
    if stack:
        print(stack[-1])
    else:
        print(-1)


stack = []
N = int(input().strip())
for _ in range(N):
    command = input().strip().split()

    if command[0] == '1':
        push(stack, int(command[1]))
    elif command[0] == '2':
        pop(stack)
    elif command[0] == '3':
        size(stack)
    elif command[0] == '4':
        is_empty(stack)
    elif command[0] == '5':
        top(stack)
