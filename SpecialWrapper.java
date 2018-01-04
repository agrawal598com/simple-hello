class SpecialWrapper
{
public static void main(String ars[])
{
int x=100;
/*In This program Primitive convert Into  Its Corresponding Object*/

/*first Done Through Wrapper Class*/

Integer obj=new Integer(x);

System.out.println(obj);

/* Second Done Through Auto-boxing*/

Integer obj1=x;

System.out.println(obj1);

/*Second one is Object Convert Into Primitive*/

/* first Tech.  through "XXXValue()" Lest Example*/

int y=obj.intValue();

System.out.println(y);

/*second Tech is Through Auto-Unboxing*/

int y1=obj1;

System.out.println(y1);
}
}