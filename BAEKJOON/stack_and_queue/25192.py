N = int(input())

cnt = 0
s = set()

for _ in range(N):
    word = input().strip()

    if word == 'ENTER':
        cnt += len(s)
        s = set()

    else:
        s.add(word)

print(cnt + len(s))
