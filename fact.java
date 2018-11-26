import java.util.*;
class factorial
{
public static void main(String args[])
{
int n,c,x=1;
  
Scanner a = new Scanner(System.in);
System.out.println("Enter a String");
n=x.nextline();
if(n<0)
  System.out.println("Number is non negative");
  else
  {
    for(c=1;c<=n;c++)
      x=x*c;
    System.out.println("Factorial of"+n+"is="+x);
  
}
}
}
