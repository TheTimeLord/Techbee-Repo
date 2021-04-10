package UserRegistration;

import java.util.Scanner;

public class FrontEnd {
	public static void main(String[] args) {
		
		boolean keepGoing;
		Scanner scan = new Scanner(System.in);
		UserProfileDAO database = new UserProfileDAO();
		
		do {
			keepGoing = false;
	
			// Add user
			System.out.print("Add new user? (y/n): ");
			if(scan.next().charAt(0) == 'y') {
				UserProfile user = new UserProfile();

				// TODO: handle input mismatch exceptions one at a time
				System.out.print("Enter name: ");
				user.setName(scan.next());
				System.out.print("Enter Age: ");
				user.setAge(scan.nextInt());
				System.out.print("Enter email: ");
				user.setEmailAddress(scan.next());
				System.out.print("Enter phone number: ");
				user.setPhoneNumber(scan.nextInt());
				System.out.print("Enter zipcode: ");
				user.setZipcode(scan.nextInt());
				System.out.print("Enter SSN: ");
				user.setSsnNumber(scan.nextInt());

				database.addUser(user);
				
			}
			
			// print all users
			System.out.print("Would you like to print all users? (y/n): ");
			if(scan.next().charAt(0) == 'y')
				database.displayUsers();
			
			
			// Ask to continue
			System.out.print("Would you like to continue? (y/n): ");
			if(scan.next().charAt(0) == 'y')
				keepGoing = true;
		} while(keepGoing);
		
	}
}
