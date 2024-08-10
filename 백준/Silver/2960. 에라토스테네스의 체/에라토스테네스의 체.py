#에라토스테네스의 체
n, k = map(int, input().split())
prime = [True]*(n+1)
prime[0], prime[1] = False, False
count = 0
for i in range(2,  n+1):
    if prime[i]: #i가 소수일 때 
        for j in range(i, n+1, i): # i의 배수
            if prime[j]: #이미 체크된 수는 다시 체크 안 함
                prime[j] = False
                count += 1
                if count == k:
                    print(j)
                    