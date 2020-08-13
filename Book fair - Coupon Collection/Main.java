def coupen(a,n,k,memo,c):
  if c>=n:
    return 0
  if memo[c]!=-1:
    return memo[c]
  res=max(a[c]+coupen(a,n,k,memo,c+k+1),coupen(a,n,k,memo,c+1))
  memo[c]=res
  return memo[c]
 
n,k=map(int,input().split(","))
memo=[]
a=[]
c=0
for i in range(n):
  a.append(int(input()))

  memo.append(-1)
print(coupen(a,n,k,memo,c))
  