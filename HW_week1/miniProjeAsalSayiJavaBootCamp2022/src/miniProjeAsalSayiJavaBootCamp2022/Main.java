package miniProjeAsalSayiJavaBootCamp2022;

public class Main {

	public static void main(String[] args) {
		int number = 0;
		boolean isPrime=true;
		
		if(number ==1) {
			System.out.println("1 is  not a prime number.");
			return;
		}
		if(number < 1) {
			System.out.println("invalid number");
			return;
		}
	
		for(int i=2;i<number;i++) {
			if((number%i) == 0) {
				isPrime = false;
				break;
			}else {
				isPrime = true;
				continue;
			}		
		}
		if(isPrime) {
			System.out.println("This number is a prime number!");
		}else {
			System.out.println("This number is not a prime number!");
		}
	}
}
