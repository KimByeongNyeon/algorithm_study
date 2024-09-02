N = int(input())
arr = list(map(int, input().split()))
arr.sort()

result = 0
if len(arr) == 1:
    result = arr[0] ** 2
else:
    result = arr[0] * arr[-1]

print(result)
