def zigma_digits(number):
	if(number/10) < 1:
		return number
	else:
		return (number % 10) + zigma_digits(number/10)

if __name__ == '__main__':
	number = 5555
	print zigma_digits(number)