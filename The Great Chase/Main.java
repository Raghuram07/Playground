c=0
t=int(input());
li =[];
for j in range(0,t):
  li=input().split();
  i=int(li[0]);
  d=int(li[1]);
  z=int(li[2])
  c=0;
  s=1;
  while(s!=0):
    i=i+d;
    for k in range(2,z+1):
      if(((i%k)==0) and ((z%k)==0)):
        c+=1;
    if(c==0):
      print("-1");
      break;
    s=i%z;
    if(s==0):
      l=i/z;
      print(int(l))
    l=0;