abstract class A
{int i;
 public abstract void run();
}
class Abstrac extends A
{int j=7;
public void run()
{
System.out.println("Abstract");
}
public static void main(String args[])
{
Abstrac a1=new Abstrac();
a1.run();
System.out.println(a1.i+" "+a1.j);
}
}