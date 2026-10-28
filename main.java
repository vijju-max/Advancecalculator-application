public class Calc 
{
  public void add(int n1,int n2)
{
 return n1+n2;
}
public void sub(int n1,int n2)
{
return n1-n2;
}
public void mult(int n1,int n2)
{
return n1*n2;
}
}
class Demo 
{
public static void main(String[] args)
{
Calc obj =new Calc ();
obj.add(28,45);
}
}
