T = int(input())
arr = []
for tc in range(T):
    N = int(input())
    arr.append(N)
    for i in range(len(arr) - 1, 0, -1):
        for j in range(i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    for k in range(len(arr)):
        print(arr[k])
    print()
