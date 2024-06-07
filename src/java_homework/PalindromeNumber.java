package java_homework;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 546756;
		int originalnumber = number;
		int reversednumber=0;
		while(number!=0) {
			int remainder = number % 10;
			reversednumber = reversednumber * 10 + remainder;
			number /= 10;
		}
		if (originalnumber== reversednumber)
		{System.out.println(originalnumber + "is a palindrome number.");
		}
		else {System.out.println(originalnumber + "is not palindrome number . ");}
		// TODO Auto-generated method stub

	}

}
