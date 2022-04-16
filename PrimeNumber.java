package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int a = 13;
		boolean prime = false;
		for (int i = 2; i <= a / 2; ++i) {
			if (a % i == 0) {
				prime = true;
				break;

			}

			if (!prime) {
				System.out.println(a+ "Its a prime number");
			} else {
				System.out.println("Its not a prime number");
			}
		}
	}
}
