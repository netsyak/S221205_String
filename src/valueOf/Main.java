package valueOf;

public class Main {

	public static void main(String[] args) {
		int i = 19;
		double d = 10.8;
		boolean b = true;
		
		String str1 = String.valueOf(i);
		String str2 = String.valueOf(b);
		String str3 = String.valueOf(d);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
    // 변수타입을 문자열(String)로 바꿔준다.
}
