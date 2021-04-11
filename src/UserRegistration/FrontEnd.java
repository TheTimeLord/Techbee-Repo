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

				//TODO: handle input mismatch exceptions one at a time
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
			
			// Print all users
			System.out.print("Would you like to print all users? (y/n): ");
			if(scan.next().charAt(0) == 'y')
				database.displayUsers();
			
			
			// Update a user
			System.out.print("Would you like to update a user? (y/n): ");
			if(scan.next().charAt(0) == 'y') {
				//TODO: handle input mismatch and OOB exceptions
				System.out.print("Which user would you like to update? (0-" + (database.numUsers()-1) + "): ");
				int uid = scan.nextInt();
				
				System.out.println("User to update:");
				database.displayUser(uid);
				
				//TODO: handle input mismatch exceptions one at a time
				System.out.print("Enter name: ");
				String name = scan.next();
				System.out.print("Enter Age: ");
				int age = scan.nextInt();
				System.out.print("Enter email: ");
				String email = scan.next();
				System.out.print("Enter phone number: ");
				int phone = scan.nextInt();
				System.out.print("Enter zipcode: ");
				int zip = scan.nextInt();
				System.out.print("Enter SSN: ");
				int ssn = scan.nextInt();
				
				database.updateUser(uid, name, age, email, phone, zip, ssn);
				System.out.println("Updated user information:");
				database.displayUser(uid);
				
			}
			
			// Delete a user
			System.out.print("Would you like to delete a user? (y/n): ");
			if(scan.next().charAt(0) == 'y') {
				//TODO: handle input mismatch and OOB exceptions
				System.out.print("Which user would you like to delete? (0-" + (database.numUsers()-1) + "): ");
				int uid = scan.nextInt();
				
				database.deleteUser(uid);
			}
			
			
			// Ask to continue
			System.out.print("Would you like to continue? (y/n): ");
			if(scan.next().charAt(0) == 'y')
				keepGoing = true;
		} while(keepGoing);
		
	}
}
