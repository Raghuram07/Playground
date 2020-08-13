lmin=int(input())
lmax=int(input())
bmin=int(input())
bmax=int(input())
k=[]
sum=0
for i in range(lmin,lmax+1):
  
  for j in range(bmin,bmax+1):
    
    a=[]
    a.append(i)
    a.append(j)
    while a[0]!=a[1]:
      
      l=min(a)
      m=a.index(l)
      if m==0:
        sum+=1
        a[1]=a[1]-l
      else:
        sum+=1
        a[0]=a[0]-l
    sum+=1
print(sum)
   
  
    
    
 
  