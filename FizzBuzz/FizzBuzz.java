class FizzBuzz {
	public static void main(String[] args) throws Exception {
		// FIRST
		// FIRST
		// FIRST
		// FIRST
		// FIRST
        for (int i = 1; i <= 15; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
        // SECOND
        // SECOND
        // SECOND
        // SECOND
        // SECOND
		for (int x = 1; x <= 15; x++) {
			if (x % 15 == 0) {
				System.out.println("FIZZBUZZ");
			} else if (x % 5 == 0) {
				System.out.println("BUZZ");
			} else if (x % 3 == 0) {
				System.out.println("FIZZ");
			} else {
				System.out.println(x);
			}
		}
        // THIRD
        // THIRD
        // THIRD
        // THIRD
        // THIRD
		for (int p = 1; p <= 15; p++) {
			if (p % 15 == 0) {
				System.out.println("fizzbuzz");
			} else if (p % 5 == 0) {
				System.out.println("buzz");
			} else if (p % 3 == 0) {
				System.out.println("fizz");
			} else {
				System.out.println(p);
			}
		}
	}
}
