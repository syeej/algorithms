def solution(N, stages):
    fail= []
    x = len(stages)
    for i in range(1, N+1):
        if x!=0:
            fail.append((i, stages.count(i)/x))
        else:
            fail.append((i, 0))
        x -= (stages.count(i))
    fail.sort(key=lambda x: (-x[1], x[0]))
    answer = list(i[0] for i in fail)
    return answer
"""
# 70점 실패(런타임 에러)
def solution(N, stages):
    stages.sort()
    fail= []
    x = len(stages)
    for i in range(1, N+1):
        fail.append((i, stages.count(i)/x))
        x -= (stages.count(i))
    fail.sort(key=lambda x: (-x[1], x[0]))
    answer = list(i[0] for i in fail)
    #answer = [i[0] for i in fail]
    return answer
"""