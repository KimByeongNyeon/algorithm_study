T = int(input())
arr = list(map(int, input().split()))

stack = []
cnt = 1
for i in arr:
    stack.append(i)

    while stack and stack[-1] == cnt:
        stack.pop()
        cnt += 1

if len(stack) == 0:
    print('Nice')
else:
    print('Sad')