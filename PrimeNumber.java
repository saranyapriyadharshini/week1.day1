package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 13;
		boolean prime = false;
		for (int i = 2; i < a; ++i) {
			if (a % i == 0) {
				prime = true;
				System.out.println("Its not a prime number");
				break;

			}

			if (!prime) {
				System.out.println("Its a prime number");

			}
		}
	}
}


