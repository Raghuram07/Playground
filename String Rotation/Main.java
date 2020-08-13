def ana(k,d):
  
  if k==d:
    return True
  else:
    k=list(k)
    d=list(d)
    k.sort()
    d.sort()
    for i in range(len(k)):
      if k[i]==d[i]:
        continue
      else:
        return False
    return True
a=input()
n=int(input())
d=""
c=0
for i in range(n):
  x,y=input().split(" ")
  y=int(y)
  if x=="L":
    c=c+y
  else:
    c=c-y
  d+=a[c]
for i in range((len(a)-len(d))+1):
  k=a[i:i+(len(d))]
  l=ana(k,d)
  if l==True:
    print("YES")
    break
else:
  print("NO")
 
    
