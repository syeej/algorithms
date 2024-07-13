from itertools import permutations
import math

def isPrime(num):
    if num < 2:
        return False
    for i in range(2, int(math.sqrt(num))+1):
        if num%i==0:
            return False;
    return True;

def solution(numbers):
    answer = 0
    arr = list(map(int, numbers))
    tmp = []
    for i in range(1, len(arr)+1):
        tmp += permutations(numbers, i)
    #for t in tmp: print(t)
    #numlist = [''.join(t) for t in tmp]
    numlist = [int(''.join(t)) for t in tmp]
    ans = set()
    for n in numlist:
        if isPrime(n):
            #print(n)
            ans.add(n)
    return len(ans)
