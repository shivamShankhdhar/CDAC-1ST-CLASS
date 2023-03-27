package day1;
import java.util.*;
public class multiplication {

	public static void main(String[] args) {
		int marks;
		//message to enter the number
		System.out.println("Emter your marks");
		Scanner m = new Scanner(System.in);
		marks = m.nextInt();
		marks > 40 ? System.out.println("Pass") : System.out.println("Fail");
		
	}

}
