T = int(input())
arr = list(map(int, input().split()))

result = []
# 큰 경우
mx = [1] * T
mn = [1] * T
for i in range(0,T - 1):
    if arr[i] <= arr[i + 1]:
        mx[i + 1] += mx[i]

for i in range(0, T - 1):
    if arr[i] >= arr[i + 1]:
        mn[i + 1] += mn[i]

max1 = max(mx)
max2 = max(mn)

print(max(max1, max2))