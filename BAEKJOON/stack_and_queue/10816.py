from bisect import bisect_left, bisect_right

N = int(input())
arr1 = list(map(int, input().split()))
M = int(input())
arr2 = list(map(int, input().split()))
arr1.sort()


def cnt_value(a, left, right):
    right_idx = bisect_right(a, right)
    left_idx = bisect_left(a, left)

    return right_idx - left_idx


for i in range(len(arr2)):
    print(cnt_value(arr1, arr2[i], arr2[i]),  end=' ')

