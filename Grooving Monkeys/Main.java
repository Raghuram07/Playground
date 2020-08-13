test=int(input())
for z in range(test):
    a=int(input())
    b=list(map(int,input().split(" ")))
   
    t=0
    ori=[]
    cur=[]
    for i in range(1,a+1):
        ori.append(i)
        cur.append(i)
    while True:
      c=[0]*a
      t+=1
      j=0
      for i in b:
        c[i-1]=cur[j]
        j+=1
      if c==ori:
        print(t)
        break
      else:
        cur=c