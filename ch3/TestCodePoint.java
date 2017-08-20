public class TestCodePoint{
	public static void main(String[] args) {
		String s = "鸡年大吉";
		//The length method yields the number of code units required for a given string in the UTF-16 encoding 
		System.out.println(s.length());
		System.out.println(s.codePointCount(0, s.length()));
	}
}