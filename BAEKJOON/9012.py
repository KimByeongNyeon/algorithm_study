import sys

T = int(sys.stdin.readline())


for tc in range(1, T + 1):
    stack = []
    arr = list(sys.stdin.readline())
    for i in range(len(arr)):
        if arr[i] == '(':
            stack.append('(')

        elif arr[i] == ')':
            if stack :
                if stack[-1] == '(':
                    stack.pop()
            else:
                stack.append(')')
    if stack:
        print('NO')
    else:
        print('YES')