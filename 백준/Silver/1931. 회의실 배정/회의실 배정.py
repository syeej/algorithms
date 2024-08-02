import sys
input = sys.stdin.readline
n = int(input())
meetings = []
for i in range(n):
    meetings.append(list(map(int, input().split())))
#회의를 최대한 많이 하기 위해서 빨리 끝나는 회의로 해야함
# (2, 2), (1, 2)일 경우 -> (1, 2), (2, 2)로 회의 2회할 수 있음
meetings.sort(key=lambda x: (x[1], x[0]))      
count = 0
end = 0
for meeting in meetings:
    if meeting[0] >=end:
        end = meeting[1]
        count+=1
print(count)