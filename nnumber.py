g = int(input("Please Enter any Number: "))
Count = 0
while(g > 0):
    g = g // 10
    Count = Count + 1
 
print("\n Number of Digits in a Given Number = %d" %Count)
