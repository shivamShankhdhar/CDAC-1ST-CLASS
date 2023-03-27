package java_class_day_3;
import java.util.Scanner;
public class password_from_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner u_input = new Scanner(System.in);
//		System.out.println("Enter the password");
		int i;
		for ( i = 1 ; i <= 3; i++) {
			System.out.println("Enter the password");
			int pass = u_input.nextInt();
			if (pass == 123) {
				System.out.println("Accepted");
				break;
			}
			
		}
		if( i == 4) {
			System.out.println("You have Tried Maximum number of time and YOUR CARD IS BLOCKED FOR 24 HOURS");
		}
		
	}
}
