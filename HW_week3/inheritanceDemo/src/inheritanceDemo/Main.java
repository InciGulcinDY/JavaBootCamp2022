package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		MilitaryCreditManager militaryCreditManager = new MilitaryCreditManager();
		
		CreditUI creditUI = new CreditUI();
		creditUI.creditCalculate(teacherCreditManager);
		creditUI.creditCalculate(militaryCreditManager);

	}

}
