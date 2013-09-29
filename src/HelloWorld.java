/*
 * HelloWorld.java
 *
 */

class HelloWorld
{
  private finai String message;
  HelloWorld(String message) {
    this.message = message;
  }
  
  void foo() {
    System.out.println(this.message);
  }
  
  public static void main(String[] args) {
    HelloWorld hw = new HelloWorld("Hello World!");
    hw.foo();
  }
}
