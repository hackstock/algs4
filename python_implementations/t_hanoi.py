
def moveDisk(fromPole,toPole):
	print 'Moving disk from %s to %s' %(fromPole,toPole)

def moveTower(height,fromPole,toPole,withPole):
	if height >= 1:
		moveTower(height - 1,fromPole,withPole,toPole)
		moveDisk(fromPole,toPole)
		moveTower(height -1,withPole,toPole,fromPole)

if __name__ == '__main__':
	moveTower(2,'A','B','C')
