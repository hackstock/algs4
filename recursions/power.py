def power(number,exponent):
	if(exponent == 0):
		return 1
	else:
		return number * power(number,exponent - 1)

if __name__ == '__main__':
	number = 3
	exponent = 3
	print power(number,exponent)