def solution(s):
    answer = 0
    x = s[0]
    same = 0
    dif = 0
    for i in range(len(s)):
        if same==dif:
            answer +=1
            x = s[i]
            same =0
            dif =0
            
        if x==s[i]:
            same+=1
        else:
            dif+=1
        
    return answer