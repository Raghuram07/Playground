def stairs(n):
  k=[0]*(n+1)
  k[0]=1
  k[1]=1
  k[2]=2
  for i in range(3,n+1):
    k[i]=k[i-1]+k[i-2]
  return k[n]
  
print(stairs(int(input())))