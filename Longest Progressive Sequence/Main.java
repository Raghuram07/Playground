n=int(input())
a=list(map(int,input().split(" ")))
ss=[]
m=[]
for i in range(n-1):
  if a[i]<=a[i+1]:
    ss.append(a[i])
  else:
    ss.append(a[i])
    if len(ss)>len(m):
      m=ss
    ss=[]
ss.append(a[-1])
if len(ss)>len(m):
      m=ss
      ss=[]
print(" ".join(map(str,m)))
    
  
    