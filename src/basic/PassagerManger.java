package basic;

import java.util.ArrayList;

public class PassagerManger {
	private ArrayList<Passager> array1 = new ArrayList<>();
	
	
	
	//ע��
	public void passagerrej(Passager pa2){
		for(int j = 0 ; j<array1.size();j++){
			if(pa2.getUsername().equals(array1.get(j).getUsername())){
				System.out.println("The name has already exist!");
				return;
			}
		}array1.add(pa2);
	}
	
	//��¼
	public void passagerenter(Passager pa1){
		for(int i= 0; i<array1.size();i++){
			if(pa1.getUsername().equals(array1.get(i).getUsername())){
			if(pa1.getPassword().equals(array1.get(i).getPassword())){
				//����˿�ϵͳ
				return;
			}
			else
				System.out.println("The password is wrong!");
			}
			System.out.println("The user does not exist!");
		}
	}
	

}
