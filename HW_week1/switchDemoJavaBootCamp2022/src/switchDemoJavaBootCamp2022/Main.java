package switchDemoJavaBootCamp2022;

public class Main {

	public static void main(String[] args) {
		char grade = 'H';
		
		switch(grade) {
		case 'A':
			System.out.println("Mukemmel, Gectiniz");
			break;
		case 'B':
			System.out.println("Cok guzel, Gectiniz");
			break;
		case 'C':
			System.out.println("Iyı, Gectiniz");
			break;
		case 'D':
			System.out.println("Fena degil, Gectiniz");
			break;
		case 'F':
			System.out.println("Kaldiniz");
			break;
			default:
				System.out.println("Gecersiz  not girdiniz.");
		}

	}

}
