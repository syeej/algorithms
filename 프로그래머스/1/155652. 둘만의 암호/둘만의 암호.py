def solution(s, skip, index):
    answer = ''
    for c in s:
        oc= ord(c)
        idx = 0 #횟수
        while idx < index:
            oc += 1
            if oc > ord('z'):
                oc = ord('a')
            if chr(oc) not in skip:
                idx += 1
        answer += chr(oc)
    return answer