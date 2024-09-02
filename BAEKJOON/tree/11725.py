import sys
sys.setrecursionlimit(10**6)


def dfs(graph, node, visited):
    for i in graph[node]:
        if not visited[i]:
            visited[i] = node
            dfs(graph, i, visited)


T = int(input())
tree = [[] for _ in range(T + 1)]
parent = [0] * (T + 1)
for _ in range(T - 1):
    node_a, node_b = map(int, input().split())
    tree[node_a].append(node_b)
    tree[node_b].append(node_a)

dfs(tree, 1, parent)

for i in range(2, T + 1):
    print(parent[i])
