str = input()
cnt = [0]*26

for i in str:
    cnt[ord(i)-97]+=1
    
print(*cnt)