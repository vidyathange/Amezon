package java_Practice;

public class Basic_java {

	public static void main(String[] args) {
		int mark=69;
		
		if(mark>=75)
		{
			System.out.println("mark obtain in first class with distingtion");
			
		}
		else if(mark<75 && mark>=60)
		{
			System.out.println("mark obtain in first class");
		}
		else if (mark>=50 && mark<60)
		{
			System.out.println("mark obtain in second class");
		}
		else if (mark>=35 && mark<50)
		{
			System.out.println("mark obtain in pass");
		}
		else if (mark<35)
		{
			System.out.println("mark obatain in fail");
		}
	

	}

}
