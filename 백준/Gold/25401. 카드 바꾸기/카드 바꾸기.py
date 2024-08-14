from sys import stdin

n = int(stdin.readline())
card = list(map(int, stdin.readline().split()))
pair = set()

for i in range(n - 1):
    for j in range(i + 1, n):
        a = (card[j] - card[i]) / (j - i) # 가능한 모든 기울기(n-1개)
        if a - int(a) == 0: # 기울기가 정수가 나오지 않으면 탈락(모든 카드가 정수이기 때문)
            b = card[j] - a * j # a가 정해졌을 때 나오는 b
            pair.add((a, b))

change_list = []
for (a, b) in pair: # 가능한 모든 (a, b) 쌍으로 그래프를 만들고 카드를 대입
    change = 0
    for l in range(n):
        if card[l] != a * l + b:
            change += 1
    change_list.append(change)

print(min(change_list)) # 바꿔야 하는 카드 개수의 최소값 출력