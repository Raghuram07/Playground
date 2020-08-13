f = []
f.append(1)
for i in range(1, 100005):
    f.append((f[i - 1] * i) % 1000000007);
n = int(input())
a = []
a = list(int(num) for num in input().strip().split())[:n]
q = int(input())
while(q > 0):
	l, r = map(int, input().split())
	mul = 1
	for i in range(l, r+1):
		mul = (mul * f[a[(int) (i-1)]]) % 1000000007;
	ans = 1;
	for i in range(0,r-l):
		ans = (ans * mul) % 1000000007;
	print(ans)
	q -=1