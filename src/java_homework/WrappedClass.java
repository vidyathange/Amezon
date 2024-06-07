package java_homework;

public class WrappedClass {

	public static void main(String[] args) {
		
		int i=10;
		
		Integer I= Integer.valueOf(i);
		//this method is resposible to convert pre-data to object
		System.out.println(I);
		System.out.println(I.intValue());
		//this method is resposible to cnvert object into the prem
		//dada type

	}

}
