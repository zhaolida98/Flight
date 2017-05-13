package basic;

import java.util.ArrayList;
class Admin{
	private String userName;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		// Test
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String username1, String password1){
		this.userName=username1;
		this.password=password1;
		
	}
}
public class AdminManger {
	private ArrayList<Admin> array2= new ArrayList<>();
	
	public void adminenter(Admin ad){
		for(int i = 0 ; i<array2.size();i++){
			if(ad.getUserName().equals(array2.get(i).getUserName())){
				if(ad.getPassword().equals(array2.get(i).getPassword())){
					//¹ÜÀíÔ±µÇÂ¼
					return;
				}
				else
					System.out.println("Password is wrong!");
			}
			else
				System.out.println("Admin dose not exist!");
		}
	}
}
