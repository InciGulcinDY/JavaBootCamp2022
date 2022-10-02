package miniProje2SesliHarflerJavaBootCamp2022;

public class Main {

	public static void main(String[] args) {
		char harf = 'a';
		char[] kalinSesli = {'A','a','I','ı','O','o','U','u'};
		char[] inceSesli  = {'E','e','İ','i','Ö','ö','Ü','ü'};
		
		for(int i = 0;i<kalinSesli.length;i++) {
			if(harf == kalinSesli[i]) {
				System.out.println("Harf kalin seslidir.");
			}
			if(harf == inceSesli[i]) {
				System.out.println("Harf ince seslidir.");
			}
		}

	}

}
