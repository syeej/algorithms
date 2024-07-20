import sys
input = sys.stdin.readline

t = int(input())  # 테스트 케이스 수
result = []

for _ in range(t):
    n = int(input())  # 지원자 수
    scores = []
    
    for _ in range(n):
        scores.append(list(map(int, input().split())))

    # 성적 순위를 기준으로 정렬 (1차: 첫 번째 성적, 2차: 두 번째 성적)
    scores.sort(key=lambda x: (x[0], x[1]))

    cnt = 1  # 항상 첫 번째 지원자는 합격
    min_second_score = scores[0][1]  # 첫 번째 지원자의 두 번째 성적

    for i in range(1, n):
        # 현재 지원자의 두 번째 성적이 이전 지원자의 두 번째 성적보다 좋으면 합격
        if scores[i][1] < min_second_score:
            cnt += 1
            min_second_score = scores[i][1]  # 가장 좋은 두 번째 성적 업데이트

    print(cnt)
