def KaprekarsConstant(num, iterations):
	a = [int(i) for i in list(str(num))]
	A = list(reversed(sorted(a)))
	B = list(sorted(a))
	a1 = 0
	b1 = 0
	a1+= 1000*A[0] + 100*A[1] + 10*A[2] + 1*A[3]
	b1+= 1000*B[0] + 100*B[1] + 10*B[2] + 1*B[3]
	if a1-b1==6174:
		return iterations
	else:
		KaprekarsConstant(a1-b1, iterations+1)


