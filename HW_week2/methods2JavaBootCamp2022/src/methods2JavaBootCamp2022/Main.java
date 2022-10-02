package methods2JavaBootCamp2022;

public class Main {

	public static void main(String[] args) {
		String message = "The weather is good today.";
		String newMessage = message.substring(0,2);
		String newMessage2 = city();
		int number = sum(5,7);
		System.out.println(newMessage);
		System.out.println(newMessage2);
		System.out.println(number);
		int sum = sum(1,2,65,32,47,85);
		System.out.println(sum);
	}

	public static void adding() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");

	}

	public static void update() {
		System.out.println("Updated");
	}
	public static int sum(int n1,int n2) {
		return (n1 + n2);
	}
	public static String city() {
		return "Ankara";
	}
	public static int sum(int...numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum+=number;
		}
		return sum;
	}
}