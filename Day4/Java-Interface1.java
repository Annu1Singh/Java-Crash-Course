interface interface1
{
void registration();
void login();
void reporting();
}
abstract class Test1 implements interface1
{
  public void registration()
  {
     System.out.println("Registration");
  }
}
abstract class Test2 extends Test1
{
  public void login()
    {
      System.out.println("Login");
     }
}
class Test3 extends Test2
{
 public void reporting()
  {
   System.out.println("Reporting");
  }
  public static void main(String... args)
{
  Test3 t= new Test3();
  t.registration();
  t.login();
  t.reporting();
}
}
