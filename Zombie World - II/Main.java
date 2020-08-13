b ,n= [int(x) for x in input().split()]

z = [int(x) for x in input().split()]
z.sort()
for i in range(n):
    b-=(z[i]%2)+(z[i]/2)
if(b<=0):
  print("NO")
else:
  print("YES")