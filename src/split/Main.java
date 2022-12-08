package split;

public class Main {

	public static void main(String[] args) {
		String text = "홍길도&이수연,박연희@김겨울-Kimjava";

		String[] names = text.split("&|,|@,|-");
		for (String name : names) {
			System.out.println(name);

		}
	}

}
