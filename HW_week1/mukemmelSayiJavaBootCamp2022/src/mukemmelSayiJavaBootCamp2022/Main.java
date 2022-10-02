package mukemmelSayiJavaBootCamp2022;

public class Main {

	public static void main(String[] args) {
		int number = 28;
		int total = 0;
		
		for(int i = 1;i<number;i++) {
			if((number%i) == 0) {
				total = total + i;
			}
		}
		System.out.println("Sayi: " + number);
		System.out.println("Bolunenlerin toplami: " + total);
		if(total == number) {
			System.out.println("Sayi mukemmel sayidir.");
		}else {
			System.out.println("Sayi mukemmel sayi degildir.");
		}
	}
}
