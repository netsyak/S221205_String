package stringTokenizer;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";

		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();

		st = new StringTokenizer(text, "/");
		// for 문 보다는 While 문을 더 많이 활용 한다고함
		while (st.hasMoreTokens()) {
			// hasMoreTokens -- 한칸씩 확인하고 확인되는 칸의 내용으로 출력코자함
			String token = st.nextToken(); 
			// nextToken 메서드를 한번은 호출해야한다.
			System.out.println(token);
		}
	}
}
