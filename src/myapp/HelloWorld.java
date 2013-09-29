/*
 * myapp.HelloWorld.java
 *
 */
 
package myapp;

class HelloWorld
{
  private final String message;
  
  HelloWorld(String message) {
    this.message = message;
  }
  
  void printMessage() {
    System.out.println(this.message);
  }
  
  public static void main(String[] args) {
    HelloWorld helloworld = new HelloWorld("Hello World!");
    helloworld.printMessage();
  }
}
