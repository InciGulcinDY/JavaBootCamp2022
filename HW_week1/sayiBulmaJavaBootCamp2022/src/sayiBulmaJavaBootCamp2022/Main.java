package sayiBulmaJavaBootCamp2022;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int number = 0;
		boolean isNumber = false;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				isNumber = true;
				break;
			} else {
				isNumber = false;

			}
		}
		if (isNumber) {
			System.out.println("Sayi tanimli dizi icerisinde bulunmaktadir.");
		} else {
			System.out.println("Sayi tanimli dizi icerisinde bulunmamaktadir.");
		}

	}
}
