package UserRegistration;

import java.util.ArrayList;

public class UserProfileDAO {
	ArrayList<UserProfile> data = new ArrayList();
	
	// Create User
	public void addUser(UserProfile user) {
		data.add(user);
	}
	
	// Read Users
	public void displayUsers() {
		for(int i=0; i<data.size(); i++) {
			System.out.println("Name: " + data.get(i).getName());
			System.out.println("Age: " + data.get(i).getAge());
			System.out.println("Email: "  + data.get(i).getEmailAddress());
			System.out.println("Phone: " + data.get(i).getPhoneNumber());
			System.out.println("Zip: " + data.get(i).getZipcode());
			System.out.println("SSN: " + data.get(i).getSsnNumber());
			
		}
	}
	public void displayUser(UserProfile user) {
		System.out.println("Name: " + user.getName());
		System.out.println("Age: " + user.getAge());
		System.out.println("Email: "  + user.getEmailAddress());
		System.out.println("Phone: " + user.getPhoneNumber());
		System.out.println("Zip: " + user.getZipcode());
		System.out.println("SSN: " + user.getSsnNumber());
	}
	
	// Update User
	public void updateUser(UserProfile user, String name, int age, String email, int phone, int zip, int ssn) {
		user.setName(name);
		user.setAge(age);
		user.setEmailAddress(email);
		user.setPhoneNumber(phone);
		user.setZipcode(zip);
		user.setSsnNumber(ssn);
	}
	
	// Delete User
	public void deleteUser(UserProfile user) {
		for(int i=0; i<data.size(); i++) {
			if(user.equals(data.get(i))) {
				data.remove(i);
			}
		}
	}
}
