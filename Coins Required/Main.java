n=int(input())
if n==1:
  print("1" + " "+"0"+" "+"0" +" "+"1")
else:
  
    a=int((n-4)/5)
    if ((n-(a*5))%2)==0:
        b=2
    else:
       b=1
    c=int((n-((a*5)+(b*1)))/2)
    print((a+b+c),a,int(c),b)