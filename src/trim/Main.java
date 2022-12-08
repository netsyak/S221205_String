package trim;

public class Main {

	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123    ";
		String tel3 = "   456    ";
		// 양 옆의 빈칸을 없애준다.  "   56  58    "
		System.out.println(tel1 + tel2+ tel3);
		System.out.println(tel1.trim() + tel2.trim()+ tel3.trim());
	}

}
