n=int(input())
a=list(map(int,input().split(" ")))
b=[]

def base(num):
  x=[]
  rem=0
  while(num>=6):
    rem=num%6
    x.append(rem)
    num=num//6
  x.append(num)
  
  y=sum(x)
  return y
for i in a:
  b.append(base(i))
m=0
for i in range(len(b)):
  for j in range(i+1,len(b)):
    if b[i]>b[j]:
      m+=1
print(m)
  