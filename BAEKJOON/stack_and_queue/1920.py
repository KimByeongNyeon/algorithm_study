def binary_search(target, data):
    start = 0
    end = N - 1

    while start <= end:
        mid = int((start + end) / 2)
        if data[mid] == target:
            return True
        if data[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
    return False


N = int(input())
arr = list(map(int, input().split()))
arr = sorted(arr)
M = int(input())
arr2 = list(map(int, input().split()))
stack = []

for i in arr2:
    if binary_search(i, arr):
        print(1)
    else:
        print(0)
