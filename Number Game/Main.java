N = int(input())
arr = []
sum = 0
arr = list(int(num) for num in input().strip().split())[:N]
for i in range(N):
	sum=sum^arr[i];  #Logical value
if(sum==0):
	print("JASBIR");  #Output the Name of winner
else:
	print("AMAN");