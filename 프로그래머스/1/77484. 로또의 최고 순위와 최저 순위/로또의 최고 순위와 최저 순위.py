def solution(lottos, win_nums):
    answer = []
    cnt = 0
    #알아볼 수 있는 번호들 중 같은 번호인 개수
    for lotto in lottos:
        for nums in win_nums:
            if lotto == nums:
                cnt+=1
    #최고로 잘 맞은 경우 = 0의 개수 + cnt           
    cntPlus = lottos.count(0) + cnt 
    if cntPlus>0 :
        answer.append(7-cntPlus) #최고 순위
    else:
        answer.append(6)
    if cnt>0:
        answer.append(7-cnt)
    else:
        answer.append(6)
    
    return answer