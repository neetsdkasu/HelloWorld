class Hello5
{
  private static Hello5 hello5 = null;
  public static Hello5 getInstance()
  {
    if (hello5 == null) hello5 = new Hello5();
    return hello5;
  }
  
  private Hello5()
  {
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
  }
  
  
  public void doit()
  {
    System.out.println("Hello World!");
  }
}
