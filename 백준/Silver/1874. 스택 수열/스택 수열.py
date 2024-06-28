n = int(input())
stack = []
count = 1
answer = []
flag = True
for _ in range(n):
    num = int(input())
    #num 이하 숫자까지 스택에 넣기
    while count<=num:
        stack.append(count)
        answer.append("+")
        count += 1
    #num과 스택 가장 최근 숫자와 동일하면 제거
    if stack[-1] == num:
        stack.pop()
        answer.append("-")
    else:
        flag = False
        break

if flag == False:
    print("NO")
else:
    for i in answer:
        print(i)