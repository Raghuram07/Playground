from itertools import permutations
n=int(input())
p=[]
def prime(num):
     for j in range(2,num):
        if i%j==0:
          break
     else:
        return True
      
for i in range(2,n+1):
  if prime(i)==True:
    p.append(i)
k=permutations(p,2)
c=0
for i in k:
  i="".join(map(str,i))
  i=int(i)
  if prime(i)==True:
    c+=1
print(c)
  


    
