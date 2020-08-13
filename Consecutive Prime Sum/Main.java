import math   
def prime_num(n): 
    if n == 1: 
        return False  
    for x in range(2, (int)(math.sqrt(n))+1): 
        if n % x == 0: 
            return False 
    return n

n = int(input())
count=0
s=2
m = n
if(n>1000000 and n<100000000):
    n=n//1000
if(n>=100000000):
    n=n//10000
    
for i in range(3,n+1):
    temp = prime_num(i)
    if(temp != 0):
        s = s + temp
        if(prime_num(s) != 0 and s <= m):
            count=count+1
print(count)