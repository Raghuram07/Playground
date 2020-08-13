n,k = [int(x) for x in input().split()]
a1 = [int(x) for x in input().split()]
a2 = [int(x) for x in input().split()]
def read(self):
    if self.buffer.tell():
        return self.buffer.read()
    return os.read(self._fd, os.fstat(self._fd).st_size)
    while True:
        b = os.read(self._fd, max(os.fstat(self._fd).st_size, BUFSIZE))
        if not b:
            break
            ptr = self.buffer.tell()
            self.buffer.seek(0, 2), self.buffer.write(b), self.buffer.seek(ptr)
        self.newlines = 0
        return self.buffer.read()
  
  
    
res = 0
diff = 0
for i in range(n):
    prod = a1[i]*a2[i]
    res = res+prod
    if prod<0 and a2[i]<0:
        temp = (a1[i]+2*k)*a2[i]  
    elif prod<0 and a1[i]<0:
        temp = (a1[i]-2*k)*a2[i] 
    elif prod>0 and a2[i]<0:
        temp = (a1[i]+2*k)*a2[i] 
    elif prod>0 and a2[i]>0:
        temp = (a1[i]-2*k)*a2[i] 
    d = abs(prod - temp)
    if d>diff:
        diff = d
def test_binary_search():
    for _ in range(10000):
        n = (random.random() * 2000) - 1000
        assert (abs(binary_search(n.__le__, -1000, 1000, 1e-7) - n) <= 1e-7)

        
        
print(res-diff)