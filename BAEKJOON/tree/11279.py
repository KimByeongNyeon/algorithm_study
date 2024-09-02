from heapq import heappush, heappop

N = int(input())  # 필요한 노드 수
arr = list(int(input()) for _ in range(N))

heap = []  # 최대힙을 구현하기 위한 리스트

# 최소힙 ( 기본 )
for num in arr:
    heappush(heap, num)

print([x for x in heap])  # 힙의 내부 상태를 출력 (양수로 저장된 상태)

if heap:
    print(heappop(heap), end=' ')
