N, K = map(int, input().split())
people = []
queue = []
idx = 0
for i in range(1, N + 1):
    people.append(i)

for i in range(N):
    # K 만큼의 범위를 알기 위해 처음에 0 + K - 1 을 해주었음
    # 원형 큐 이기에 나머지 연산을 통해 인덱스 계산
    # 그러면 0 + 3 - 1 % 7 = 2 이므로 2번째 인덱스인 3이 뽑힘
    # 그 다음 2 + 3 - 1 % 6 = 4 이므로 4번째 인덱스인 6이 뽑힘
    # 그 다음 4 + 3 - 1 % 5 = 1 이므로 1번째 인덱스인 2가 뽑힘
    idx = (idx + K - 1) % len(people)

    queue.append(str(people.pop(idx)))

print('<'+', '.join(queue) + '>')
