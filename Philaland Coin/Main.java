T=int(input())
for i in range(1,T+1):
    n=int(input())
    count=0
    while n!=0:
        n=n//2
        count+=1
    print(count)