
class parent
{
int x=12;
int y=98;
public void display()
{
System.out.println("the first value is"+x);
System.out.println("the first value of String is" +y );
}
}
class anand1 extends parent
{
public void display()
{
int z=y;
int t=45;

System.out.println("the value of charecter is"+z );
System.out.println("the first value integer is"+t );
}
}
class anand2 extends parent
{
public void display()
{
int h=43;
System.out.println("the first value of String is"+h);
}
}
class anand3 extends parent
{
public void display()
{
int c=34;
System.out.println("the first value integer is"+c);
}
}
class kite
{
public static void main(String [] args)
{
parent ob;
ob=new anand1();
ob.display();
ob=new anand2();
ob.display();
ob=new anand3();
ob.display();
}
} 

