package demo;

public class StringFunctions {

	public static void main(String[] args) {
		String str1 = "Hello My Dear Selenium";
		System.out.println(str1.charAt(6));//M
		System.out.println(str1.concat(" with Java"));//Hello My Dear Selenium with Java
		System.out.println(str1.replace('e', 'Z'));//HZllo My DZar SZlZnium
		System.out.println(str1.indexOf('o'));//4
		System.out.println(str1.lastIndexOf('e'));
		System.out.println(str1.substring(2,7));

	}

}
