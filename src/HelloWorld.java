/*
* HelloWorld.java
*
*/

class HelloWorld
{
 	public static void main(String[] args) {
      		HelloWorld hw = new HelloWorld("Hello World!");
          	hw.foo();
          	
          	
          	Unko unko = new Unko("Unko dayo", 100);
          	Unko kuso = new Unko("Unko dayo", 100);
          	System.out.println(unko);
          	System.out.println(kuso);
          	System.out.println(unko.equals(kuso));
          	
          	
	}
	      
	private final String message;
	
	HelloWorld(String message) {
		this.message = message;
	}
			    
	void foo() {
		System.out.println(this.message);
	}
}
