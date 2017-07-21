while True:
	print("Enter '0' for exit.")
	num = input("Enter any character: ")
	if num == '0':
		break
	else:
		if((num>='a' and num<='z') or (num>='A' and num<='Z')):
			print(num, "is an alphabet.\n")
		else:
			print(num, "is not an alphabet.\n")
