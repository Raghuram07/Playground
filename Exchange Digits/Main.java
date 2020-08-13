from itertools import permutations
a,b=input().split(" ")
c=list(b)
b=int(b)

a=list(a)
a=[int(i) for i in a]
a.sort()
if len(a)<len(c):
  print(-1)
else:
  perm=permutations(a)
  for i in perm:
    i="".join(map(str,i))
    if int(i)>b:
      print(i)
      break
  else:
    print(-1)
