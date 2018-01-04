class SpecialWrapper1
{
public static void main(String args[])
{
/* This program For String to primitive*/
 
String s="123";

/* XYZ(Class Name).parseXYZ(DataType)() this used only for numeric convert in primitive*/

int x=Integer.parseInt(s);

System.out.println(x);

/*Second is Primitive to String Convertion*/

/*first*/

String s1=""+x;

System.out.println(s1);

/*second*/

String s2=Integer.toString(x);

System.out.println(s2);

/*Third*/

int a=123;

Integer obj=a;

String s3=obj.toString();

System.out.println(s3);

String s4="131";

String s5=s4.toString();
System.out.println(s5);

}
}