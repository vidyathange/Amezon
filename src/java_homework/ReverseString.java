package java_homework;

public class ReverseString {

	public static void main(String[] args) {
		String str =" Vidya Thange" ;
		String reversed="";
		for (int i= str.length()-1; i>0; i--) {
			reversed +=str.charAt(i);
		}
		System.out.println("Reversed string :"+reversed);
		// TODO Auto-generated method stub

	}

}
