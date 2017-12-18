def h(n):
	if (n==0):
		return [[1]]
	temp = h(n-1)
	v = []
	for i in range(2**n):
		t= []
		v.append(t)
	
	for x in range(4):
		it = 2**n//2 if x>=2 else 0
		for i in temp:
			for j in i:
				if(x<3):
					v[it].append(j)
				else:
					v[it].append(-j)
			it+=1
		
	return v

n = int(input())
n-=1
print(h(n))
