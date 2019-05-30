class SecondLarger
{
public static void main(String args[])
{
int a=100,b=300,c=500;
if(a>b && a>c)
{
System.out.println("a is larger");
}
else if(b>a && b>c)
{
System.out.println("b is larger");
}
else
{
System.out.println("c is larger");
}
if(c<a && c<b)
{
System.out.println("a is second larger");
}
else
{
System.out.println("b is second larger");
}
}
}