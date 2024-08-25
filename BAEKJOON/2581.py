def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True


M = int(input())
N = int(input())

stack = []

# M부터 N까지의 숫자 중 소수를 찾기
for i in range(M, N + 1):
    if is_prime(i):
        stack.append(i)

if not stack:
    print(-1)
else:
    # 소수들의 합과 최솟값 계산
    my_sum = sum(stack)
    mn = min(stack)

    print(my_sum)
    print(mn)
