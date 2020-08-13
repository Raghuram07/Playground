n=int(input())
t=int(input())
a=[]
d=[0]*n
f=[0]*n

for i in range(n):
    a.append(input().split(" "))


for i in range(0,t,2):
    for j in range(n):
        d[j]+=(int(a[j][i])*int(a[j][t]))+(int(a[j][i+1])*int(a[j][t]))
        
    z=max(d)
    y=d.index(z)
    f[y]+=1
ma=0
k=0
for i in f:
    if i>ma:
        k=f.index(i)
        ma=i
print(k+1)