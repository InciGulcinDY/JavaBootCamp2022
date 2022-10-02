package methodsJavaBootCamp2022;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
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
			mesajVer("sayi mevcuttur: " + number);
		} else {
			mesajVer("sayi mevcut degildir: " + number);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}
