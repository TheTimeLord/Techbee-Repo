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
	public void displayUser(int userIndex) {
		if(userIndex >= data.size() || userIndex < 0)
			System.out.println("Error: User index out of bounds");
		else {
			System.out.println("Name: " + data.get(userIndex).getName());
			System.out.println("Age: " + data.get(userIndex).getAge());
			System.out.println("Email: "  + data.get(userIndex).getEmailAddress());
			System.out.println("Phone: " + data.get(userIndex).getPhoneNumber());
			System.out.println("Zip: " + data.get(userIndex).getZipcode());
			System.out.println("SSN: " + data.get(userIndex).getSsnNumber());
		}
	}
	
	// Update User
	public void updateUser(int userIndex, String name, int age, String email, int phone, int zip, int ssn) {
		if(userIndex >= data.size() || userIndex < 0)
			System.out.println("Error: User index out of bounds");
		else {
			data.get(userIndex).setName(name);
			data.get(userIndex).setAge(age);
			data.get(userIndex).setEmailAddress(email);
			data.get(userIndex).setPhoneNumber(phone);
			data.get(userIndex).setZipcode(zip);
			data.get(userIndex).setSsnNumber(ssn);
		}
	}
	
	// Delete User
	public void deleteUser(int userIndex) {
		if(userIndex >= data.size() || userIndex < 0)
			System.out.println("Error: User index out of bounds");
		else {
			data.remove(userIndex);
		}
	}
}
