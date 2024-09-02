N, M = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
pre = [0]
mysum = 0

for i in range(N):
    mysum += arr[i]
    pre.append(mysum)

for i in range(M):
    i, j = map(int, sys.stdin.readline().split())
    print(pre[j] - pre[i - 1])
