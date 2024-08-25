def prime_factors(N):
    factors = []
    i = 2
    while i <= N:
        if N % i == 0:
            factors.append(i)
            N = N / i
        else:
            i = i + 1
    return factors


N = int(input())
arr = prime_factors(N)

for i in range(len(arr)):
    print(arr[i])
