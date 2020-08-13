t=int(input())
for i in range(t):
  a=int(input())
  tot=a//4 + a%4
  if tot%2==0:
    print("No")
  else:
    print("Yes")