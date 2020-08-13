a,b=input().split()
a=int(a)
b=int(b)
k=list(map(int,input().split(" ")))
for i in range(b):
  c=0
  min,max=input().split(" ")
  min=int(min)
  max=int(max)
  for i in k:
    if i>=min and i<=max:
      c+=1
  print(c,end=" ")
   