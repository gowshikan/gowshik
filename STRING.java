import java.util.*;
class ReverseString
{
public static void main(String args[])
{
String a,b="";
Scanner x = new Scanner(System.in);
System.out.println("Enter a String");
a=x.nextline();
int c=a.c();
for(int i=c-1;i>=0;i--)
b=b+a.charAt(i);
System.out.println("REverse the String"+b);
}
}
