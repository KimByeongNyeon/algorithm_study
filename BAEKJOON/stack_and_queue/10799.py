arr = list(input())
stack = []
cnt = 0
for i in range(len(arr)):
    if arr[i] == '(':
        stack.append(i)

    elif arr[i] == ')':
        if arr[i - 1] == '(':
            stack.pop()
            cnt += len(stack)
        else:
            stack.pop()
            cnt += 1
print(cnt)