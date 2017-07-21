x = int(input("Enter a number: "))

if x < 0:
   print("Enter a positive number")
else:
   y = 0
   while(x > 0):
       y += x
       x-= 1
   print("The sum is",y)
