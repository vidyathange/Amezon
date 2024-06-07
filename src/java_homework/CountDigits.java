package java_homework;

public class CountDigits {

	public static void main(String[] args) {
		int number = 34567823;
		int i = 0 ;
		while (number != 0) {
			number /= 10;
			i++;
			}
		System.out.println("number of digits : "+ i);

	}

}
