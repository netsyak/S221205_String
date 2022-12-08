package subString;

public class Main {

	public static void main(String[] args) {
		String ssn = "820602-1235467";

		String firstNum = ssn.substring(0, 6);// 처음부터 5번째까지 출력
		String secondNum = ssn.substring(7); // 7번부터 끝까지 출력
		

		System.out.println("firstNUm : " + firstNum);
		System.out.println("secondNum : " + secondNum);
	}

}
