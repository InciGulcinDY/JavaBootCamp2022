package youTubeTraining;

public class Main {

	public static void main(String[] args) {
		// Example-1 :
		int number1 = 10;
		int number2 = 20;
		number1 = number2;
		number2 = 100;

		System.out.println(number1);

		// Example-2 :
		int[] numbers1 = { 1, 2, 3 };
		int[] numbers2 = { 10, 20, 30 };
		numbers1 = numbers2;

		numbers2[0] = 1000;

		System.out.println(numbers1[0]);

	}

}
