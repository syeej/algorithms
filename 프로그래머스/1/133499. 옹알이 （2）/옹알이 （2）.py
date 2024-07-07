def solution(babbling):
    answer = 0
    words = ['aya', 'ye', 'woo', 'ma']
    for b in babbling:
        for word in words:
            if word*2 not in b:
                b = b.replace(word, ' ')
        if len(b.strip())==0:
            answer += 1
    return answer