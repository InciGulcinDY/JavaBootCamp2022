package methodOverloadingJavaBootCamp2022;

public class Main {

	public static void main(String[] args) {
		ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
		System.out.println(arithmeticOperations.sum(2, 3));
		System.out.println(arithmeticOperations.sum(2, 3, 7));

	}

}
