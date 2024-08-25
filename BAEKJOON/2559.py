import sys
input = sys.stdin.readline

N, M = map(int, input().split())
arr = list(map(int, input().split()))
current_sum = sum(arr[:M])
result = current_sum
for i in range(M, N):
    current_sum += arr[i] - arr[i - M]
    if current_sum > result:
        result = current_sum
print(result)
